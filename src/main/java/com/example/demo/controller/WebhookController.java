package com.example.demo.controller;

import com.example.demo.model.WebhookData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private WebhookData latestWebhookData;

    // API POST để nhận webhook từ PayOS
    @PostMapping("/payment-success")
    public ResponseEntity<String> handlePaymentSuccess(@RequestBody WebhookData webhookData) {
        // Lưu dữ liệu webhook nhận được
        latestWebhookData = webhookData;
        System.out.println("Received webhook data: " + webhookData);

        // Phản hồi với mã 200 OK để xác nhận đã nhận webhook thành công
        return ResponseEntity.ok("Received webhook data successfully.");
    }

    // API GET để lấy dữ liệu webhook mới nhất
    @GetMapping("/latest-payment-status")
    public ResponseEntity<WebhookData> getLatestPaymentStatus() {
        if (latestWebhookData != null) {
            return ResponseEntity.ok(latestWebhookData);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
