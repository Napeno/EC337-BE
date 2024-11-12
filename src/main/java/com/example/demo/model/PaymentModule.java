package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class PaymentModule {

    @Id
    private String id;
    private String orderCode;
    private int amount;
    private int amountPaid;
    private int amountRemaining;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime canceledAt;
    private String cancellationReason;

    @OneToMany(mappedBy = "payment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TransactionModule> transactions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCanceledAt() {
        return canceledAt;
    }

    public void setCanceledAt(LocalDateTime canceledAt) {
        this.canceledAt = canceledAt;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public List<TransactionModule> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionModule> transactions) {
        this.transactions = transactions;
    }
// Getters và setters
}
