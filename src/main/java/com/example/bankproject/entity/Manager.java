package com.example.bankproject.entity;

import com.example.bankproject.entity.enums.StatusState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static jakarta.persistence.CascadeType.*;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "managers")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;//0210

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusState status;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @OneToMany(cascade = {MERGE, REFRESH, PERSIST}, fetch = FetchType.LAZY, mappedBy = "manager",
            orphanRemoval = true)
    @JsonIgnore
    private Set<Agreement> agreements = new HashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;

        if (!Objects.equals(firstName, manager.firstName)) return false;
        return Objects.equals(lastName, manager.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Manager  " +
                "id=" + id + '\n' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' + '\n' +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", created_at=" + createdAt;
    }
}
