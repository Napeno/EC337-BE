package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class TransactionModule {

    @Id
    private String reference;
    private String accountNumber;
    private int amount;
    private String counterAccountBankId;
    private String counterAccountBankName;
    private String counterAccountName;
    private String counterAccountNumber;
    private String description;
    private LocalDateTime transactionDateTime;
    private String virtualAccountName;
    private String virtualAccountNumber;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private PaymentModule payment;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCounterAccountBankId() {
        return counterAccountBankId;
    }

    public void setCounterAccountBankId(String counterAccountBankId) {
        this.counterAccountBankId = counterAccountBankId;
    }

    public String getCounterAccountBankName() {
        return counterAccountBankName;
    }

    public void setCounterAccountBankName(String counterAccountBankName) {
        this.counterAccountBankName = counterAccountBankName;
    }

    public String getCounterAccountName() {
        return counterAccountName;
    }

    public void setCounterAccountName(String counterAccountName) {
        this.counterAccountName = counterAccountName;
    }

    public String getCounterAccountNumber() {
        return counterAccountNumber;
    }

    public void setCounterAccountNumber(String counterAccountNumber) {
        this.counterAccountNumber = counterAccountNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getVirtualAccountName() {
        return virtualAccountName;
    }

    public void setVirtualAccountName(String virtualAccountName) {
        this.virtualAccountName = virtualAccountName;
    }

    public String getVirtualAccountNumber() {
        return virtualAccountNumber;
    }

    public void setVirtualAccountNumber(String virtualAccountNumber) {
        this.virtualAccountNumber = virtualAccountNumber;
    }

    public PaymentModule getPayment() {
        return payment;
    }

    public void setPayment(PaymentModule payment) {
        this.payment = payment;
    }

    // Getters và setters
}
