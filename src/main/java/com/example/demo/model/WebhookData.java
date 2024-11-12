package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

public class WebhookData {
    private String code;
    private String desc;
    private boolean success;
    private Data data;
    private String signature;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public static class Data {
        private String orderCode;
        private int amount;
        private String description;
        private String accountNumber;
        private String reference;
        private String transactionDateTime;
        private String currency;
        private String paymentLinkId;
        private String code;
        private String desc;
        private String counterAccountBankId;
        private String counterAccountBankName;
        private String counterAccountName;
        private String counterAccountNumber;
        private String virtualAccountName;
        private String virtualAccountNumber;
        private String id; // Assuming each Data entry has a unique ID
        private int amountPaid;
        private int amountRemaining;
        private String status;
        private LocalDateTime createdAt;
        private LocalDateTime canceledAt;
        private String cancellationReason;
        private List<TransactionModule> transactions;

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getTransactionDateTime() {
            return transactionDateTime;
        }

        public void setTransactionDateTime(String transactionDateTime) {
            this.transactionDateTime = transactionDateTime;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getPaymentLinkId() {
            return paymentLinkId;
        }

        public void setPaymentLinkId(String paymentLinkId) {
            this.paymentLinkId = paymentLinkId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        // Getters và setters cho các trường
    }
}