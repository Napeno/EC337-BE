package com.example.demo.controller;
import com.example.demo.model.PaymentModule;
import com.example.demo.model.WebhookData;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // API POST để lưu dữ liệu webhook
    @PostMapping("/webhook")
    public ResponseEntity<String> handleWebhook(@RequestBody WebhookData webhookData) {
        paymentService.savePayment(webhookData);
        return ResponseEntity.ok("Payment data saved successfully.");
    }

    // API GET để lấy danh sách tất cả các payment
    @GetMapping
    public ResponseEntity<List<PaymentModule>> getAllPayments() {
        List<PaymentModule> payments = paymentService.getAllPayments();
        return ResponseEntity.ok(payments);
    }
}
