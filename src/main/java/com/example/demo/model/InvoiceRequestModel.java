//package com.example.demo.model;
//
//import jakarta.persistence.Id;
//
//import java.util.List;
//import java.util.UUID;
//
//public class InvoiceRequestModel {
//    @Id
//    private UUID id;
//    private Detail detail;
//    private List<Item> items;
//    private Configuration configuration;
//    private Amount amount;
//
//    // Getters and Setters
//
//    public static class Detail {
//        private String invoiceNumber;
//        private String invoiceDate;
//        private PaymentTerm paymentTerm;
//        private String currencyCode;
//        private String reference;
//        private String note;
//        private String termsAndConditions;
//        private String memo;
//
//        // Getters and Setters
//    }
//
//    public static class PaymentTerm {
//        private String termType;
//        private String dueDate;
//
//        // Getters and Setters
//    }
//
//    public static class Item {
//        private String name;
//        private String description;
//        private String quantity;
//        private UnitAmount unitAmount;
//        private Discount discount;
//        private String unitOfMeasure;
//
//        // Getters and Setters
//    }
//
//    public static class UnitAmount {
//        private String currencyCode;
//        private String value;
//
//        // Getters and Setters
//    }
//
//    public static class Discount {
//        private String percent;
//        private Amount amount;
//
//        // Getters and Setters
//    }
//
//    public static class Configuration {
//        private PartialPayment partialPayment;
//        private boolean allowTip;
//        private boolean taxCalculatedAfterDiscount;
//        private boolean taxInclusive;
//
//        // Getters and Setters
//    }
//
//    public static class PartialPayment {
//        private boolean allowPartialPayment;
//        private Amount minimumAmountDue;
//
//        // Getters and Setters
//    }
//
//    public static class Amount {
//        private Breakdown breakdown;
//
//        // Getters and Setters
//    }
//
//    public static class Breakdown {
//        private Custom custom;
//        private Shipping shipping;
//        private Discount invoiceDiscount;
//
//        // Getters and Setters
//    }
//
//    public static class Custom {
//        private String label;
//        private Amount amount;
//
//        // Getters and Setters
//    }
//
//    public static class Shipping {
//        private Amount amount;
//        private Tax tax;
//
//        // Getters and Setters
//    }
//
//    public static class Tax {
//        private String name;
//        private String percent;
//
//        // Getters and Setters
//    }
//}
