package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class TestController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    // API endpoint để nhận webhook từ PayOS
    @PostMapping("/payment-success")
    public ResponseEntity<String> handlePaymentSuccess() {
        // In thông tin dữ liệu webhook nhận được
        System.out.println("Received webhook data");
        messagingTemplate.convertAndSend("/topic/payment-status", "Payment successful");
        // Phản hồi với mã 200 OK để xác nhận đã nhận webhook thành công
        return ResponseEntity.ok("Received webhook data successfully.");
    }
}
