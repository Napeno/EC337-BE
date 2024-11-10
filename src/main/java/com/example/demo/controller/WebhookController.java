package com.example.demo.controller;

import com.example.demo.model.WebhookModel;
import com.example.demo.service.WebhookService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private WebhookService webhookService;

    @Autowired
    private SimpMessagingTemplate messagingTemplate; // Inject SimpMessagingTemplate

    // API endpoint để nhận webhook từ PayOS
    @PostMapping("/payment-success")
    public ResponseEntity<String> handlePaymentSuccess(@RequestBody WebhookModel webhookData) {
        // In thông tin dữ liệu webhook nhận được
        System.out.println("Received webhook data: " + webhookData);

        // Gọi service để xử lý thông tin thanh toán
        webhookService.processPayment(webhookData);

        // Broadcast the payment status to the WebSocket clients
        messagingTemplate.convertAndSend("/topic/payment-status", webhookData);

        // Phản hồi với mã 200 OK để xác nhận đã nhận webhook thành công
        return ResponseEntity.ok("Received webhook data successfully.");
    }
}
