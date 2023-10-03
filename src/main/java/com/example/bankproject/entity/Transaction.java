package com.example.bankproject.entity;

import com.example.bankproject.entity.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "debit_account_id", referencedColumnName = "id")
    private Account debitAccountId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_account_id", referencedColumnName = "id")
    private Account creditAccountId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) && Objects.equals(debitAccountId, that.debitAccountId) && Objects.equals(creditAccountId, that.creditAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, debitAccountId, creditAccountId);
    }

    @Override
    public String toString() {
        return "Transaction --" +
                "id: " + id + "\n" +
                ", debitAccountId: " + debitAccountId +
                ", creditAccountId: " + creditAccountId +
                ", type: " + type + "\n" +
                ", amount: " + amount +
                ", description: '" + description+
                ", createdAt: " + createdAt +"\n";
    }
}