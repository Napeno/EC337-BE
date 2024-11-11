//package com.example.demo.controller;
//
//import com.example.demo.model.WebhookRequest;
//import com.example.demo.service.PaymentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/webhooks")
//public class PaymentWebhookController {
//
//    @Autowired
//    private PaymentService paymentService;
//
//    @PostMapping("/payment-success")
//    public ResponseEntity<?> handlePaymentSuccess(@RequestBody WebhookRequest webhookRequest) {
//        // Kiểm tra tính hợp lệ của chữ ký và xử lý thanh toán
//        boolean isValidSignature = paymentService.verifySignature(webhookRequest);
//        if (!isValidSignature) {
//            return ResponseEntity.badRequest().body("Invalid signature");
//        }
//
//        // Xử lý dữ liệu thanh toán nếu thành công
//        if (webhookRequest.getSuccess()) {
//            paymentService.processPayment(webhookRequest.getData());
//            return ResponseEntity.ok().body("Payment successfully processed");
//        } else {
//            // Nếu thanh toán thất bại
//            return ResponseEntity.ok().body("Payment failed");
//        }
//    }
//}
