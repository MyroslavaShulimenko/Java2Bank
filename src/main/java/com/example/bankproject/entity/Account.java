package com.example.bankproject.entity;

import com.example.bankproject.entity.enums.Currencies;
import com.example.bankproject.entity.enums.ProductType;
import com.example.bankproject.entity.enums.StatusState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    @JsonIgnore
    private Client client;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ProductType type;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusState status;

    @Column(name = "balance")
    private BigDecimal balance;


    @Column(name = "currency_code")
    @Enumerated(EnumType.STRING)
    private Currencies currencyCode;

    @Column(name = "created_at")
    private String createdAt;

    @OneToOne(mappedBy = "account")
    @JsonIgnore
    private Agreement agreement;

    @OneToMany(cascade = {MERGE, REFRESH, PERSIST}, fetch = FetchType.LAZY, mappedBy = "debitAccountId",
            orphanRemoval = true)
    @JsonIgnore
    private List<Transaction> debitTransaction;

    @OneToMany(cascade = {MERGE, REFRESH, PERSIST}, fetch = FetchType.LAZY, mappedBy = "creditAccountId",
            orphanRemoval = true)
    @JsonIgnore
    private List<Transaction> creditTransaction;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;

        return Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return client != null ? client.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Account  " +
                "id= " + id + '\n' +
                ", client_id= " + client +
                ", name - " + name + '\'' +
                ", type - " + type +
                ", status - " + status +
                ", balance= " + balance +
                ", currencyCode= " + currencyCode + '\'' +
                ", created_at - " + createdAt;

    }
}
