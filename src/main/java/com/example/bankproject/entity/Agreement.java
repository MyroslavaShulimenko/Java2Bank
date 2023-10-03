package com.example.bankproject.entity;

import com.example.bankproject.entity.enums.StatusState;
import com.example.bankproject.entity.enums.ProductType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import static jakarta.persistence.CascadeType.*;


@Entity
@Table(name = "agreements")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_type")
    @Enumerated(EnumType.STRING)
    private ProductType productId;

    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusState status;

    @Column(name = "totalsum")
    private BigDecimal totalsum;

    @OneToOne(cascade = {MERGE, PERSIST, REFRESH})
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @JsonIgnore
    private Account account;

    @ManyToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", referencedColumnName = "id")
    @JsonIgnore
    private Manager manager;


    @Column(name = "created_at")
    private LocalDate createdAt;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agreement agreement = (Agreement) o;
        return Objects.equals(id, agreement.id) && productId == agreement.productId && Objects.equals(account, agreement.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, productId);
    }

    @Override
    public String toString() {
        return "Agreement -  " +
                "id: " + id +
                ", productId: " + productId +
                ", interestRate: " + interestRate +
                ", status: " + status +
                ", sum: " + totalsum +
                ", createdAt: " + createdAt + "\n";
    }
}