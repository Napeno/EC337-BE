package com.example.demo.service;

import com.example.demo.model.WebhookRequest;
import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Arrays;

@Service
public class PaymentService {

    // Xác thực chữ ký từ PayOS
    public boolean verifySignature(WebhookRequest webhookRequest) {
        String payload = webhookRequest.getCode() + webhookRequest.getDesc() + webhookRequest.getSuccess() + webhookRequest.getData();
        String secretKey = "your_secret_key";  // Thay bằng khóa bí mật của bạn từ PayOS
        String expectedSignature = generateSha256Hex(Arrays.toString((payload + secretKey).getBytes()));

        return webhookRequest.getSignature().equals(expectedSignature);
    }

    // Xử lý thanh toán, ví dụ như lưu vào cơ sở dữ liệu
    public void processPayment(WebhookRequest.WebhookData data) {
        // Logic để xử lý thanh toán, ví dụ lưu vào database
        System.out.println("Processing payment for order: " + data.getOrderCode());
        // Thêm mã lưu dữ liệu vào cơ sở dữ liệu nếu cần
    }

    public String generateSha256Hex(String data) {
        return DigestUtils.sha256Hex(data);
    }
}
