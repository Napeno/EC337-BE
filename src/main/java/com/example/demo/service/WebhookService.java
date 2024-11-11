//package com.example.demo.service;
//
//import com.example.demo.model.WebhookModel;
//import org.springframework.stereotype.Service;
//
//@Service
//public class WebhookService {
//
//    public void processPayment(WebhookModel webhookData) {
//        // Kiểm tra nếu thanh toán thành công
//        if (webhookData.isSuccess()) {
//            System.out.println("Thanh toán thành công cho đơn hàng: " + webhookData.getData().getOrderCode());
//            System.out.println("Số tiền: " + webhookData.getData().getAmount());
//            System.out.println("Mô tả: " + webhookData.getData().getDescription());
//            // Thêm logic xử lý tiếp theo như lưu vào database, gửi thông báo, v.v.
//        } else {
//            System.out.println("Thanh toán thất bại: " + webhookData.getDesc());
//        }
//    }
//}