package com.example.bankproject.entity;

import com.example.bankproject.entity.enums.StatusState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; //0210 был BigInteger

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusState status;

    @Column(name = "tax_code")
    private String taxСode;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "created_at")
    private LocalDate createdAt;


    @OneToMany(cascade = {MERGE, PERSIST, REFRESH, REMOVE}, mappedBy = "client", orphanRemoval = true)
    @JsonIgnore
    private Set<Account> accountSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(email, client.email) &&
                Objects.equals(address, client.address) && Objects.equals(phone, client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, address, phone);
    }

    @Override
    public String toString() {
        return "Client--  " +
                "id: " + id +"\n"+
                ", firstName: " + firstName +
                ", lastName: " + lastName +
                ", taxСode: " + taxСode +"\n"+
                ", email: " + email +
                ", address: " + address +
                ", phone: " + phone +
                ", status: " + status +
                ", createdAt: " + createdAt +"\n";
    }
}