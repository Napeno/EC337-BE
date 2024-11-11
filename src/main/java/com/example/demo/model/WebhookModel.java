//package com.example.demo.model;
//
//public class WebhookModel {
//    private String code;
//    private String desc;
//    private boolean success;
//    private Data data;
//    private String signature;
//
//    // Getters and Setters
//
//    public static class Data {
//        private int orderCode;
//        private int amount;
//        private String description;
//        private String accountNumber;
//        private String reference;
//        private String transactionDateTime;
//        private String currency;
//        private String paymentLinkId;
//        private String statusCode;
//        private String statusDesc;
//        private String counterAccountBankId;
//        private String counterAccountBankName;
//        private String counterAccountName;
//        private String counterAccountNumber;
//        private String virtualAccountName;
//        private String virtualAccountNumber;
//
//        public int getOrderCode() {
//            return orderCode;
//        }
//
//        public void setOrderCode(int orderCode) {
//            this.orderCode = orderCode;
//        }
//
//        public int getAmount() {
//            return amount;
//        }
//
//        public void setAmount(int amount) {
//            this.amount = amount;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//
//        public String getAccountNumber() {
//            return accountNumber;
//        }
//
//        public void setAccountNumber(String accountNumber) {
//            this.accountNumber = accountNumber;
//        }
//
//        public String getReference() {
//            return reference;
//        }
//
//        public void setReference(String reference) {
//            this.reference = reference;
//        }
//
//        public String getTransactionDateTime() {
//            return transactionDateTime;
//        }
//
//        public void setTransactionDateTime(String transactionDateTime) {
//            this.transactionDateTime = transactionDateTime;
//        }
//
//        public String getCurrency() {
//            return currency;
//        }
//
//        public void setCurrency(String currency) {
//            this.currency = currency;
//        }
//
//        public String getPaymentLinkId() {
//            return paymentLinkId;
//        }
//
//        public void setPaymentLinkId(String paymentLinkId) {
//            this.paymentLinkId = paymentLinkId;
//        }
//
//        public String getStatusCode() {
//            return statusCode;
//        }
//
//        public void setStatusCode(String statusCode) {
//            this.statusCode = statusCode;
//        }
//
//        public String getStatusDesc() {
//            return statusDesc;
//        }
//
//        public void setStatusDesc(String statusDesc) {
//            this.statusDesc = statusDesc;
//        }
//
//        public String getCounterAccountBankId() {
//            return counterAccountBankId;
//        }
//
//        public void setCounterAccountBankId(String counterAccountBankId) {
//            this.counterAccountBankId = counterAccountBankId;
//        }
//
//        public String getCounterAccountBankName() {
//            return counterAccountBankName;
//        }
//
//        public void setCounterAccountBankName(String counterAccountBankName) {
//            this.counterAccountBankName = counterAccountBankName;
//        }
//
//        public String getCounterAccountName() {
//            return counterAccountName;
//        }
//
//        public void setCounterAccountName(String counterAccountName) {
//            this.counterAccountName = counterAccountName;
//        }
//
//        public String getCounterAccountNumber() {
//            return counterAccountNumber;
//        }
//
//        public void setCounterAccountNumber(String counterAccountNumber) {
//            this.counterAccountNumber = counterAccountNumber;
//        }
//
//        public String getVirtualAccountName() {
//            return virtualAccountName;
//        }
//
//        public void setVirtualAccountName(String virtualAccountName) {
//            this.virtualAccountName = virtualAccountName;
//        }
//
//        public String getVirtualAccountNumber() {
//            return virtualAccountNumber;
//        }
//
//        public void setVirtualAccountNumber(String virtualAccountNumber) {
//            this.virtualAccountNumber = virtualAccountNumber;
//        }
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//
//    public boolean isSuccess() {
//        return success;
//    }
//
//    public void setSuccess(boolean success) {
//        this.success = success;
//    }
//
//    public Data getData() {
//        return data;
//    }
//
//    public void setData(Data data) {
//        this.data = data;
//    }
//
//    public String getSignature() {
//        return signature;
//    }
//
//    public void setSignature(String signature) {
//        this.signature = signature;
//    }
//}