package com.example.demo.controller;

import com.example.demo.service.PayPalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//https://api-m.sandbox.paypal.com
@RequestMapping("https://api-m.sandbox.paypal.com/pa/v1/oauth2/token")
public class PayPalController {

    private final PayPalService payPalService;

    @Autowired
    public PayPalController(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @PostMapping("/getAccessToken")
    public ResponseEntity<String> getAccessToken() {
        try {
            String accessToken = payPalService.getAccessToken();
            return ResponseEntity.ok(accessToken); // Trả về access_token cho frontend
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }

//    @PostMapping
//    public ResponseEntity<InvoiceRequestModel> createInvoice(@RequestBody InvoiceRequestModel invoiceRequestModel) {
//        try {
//            // Get the access token from PayPal
//            String accessToken = payPalService.getAccessToken();
//
//            // Pass the token to createInvoice method
//            InvoiceRequestModel invoice = payPalService.createInvoice(invoiceRequestModel, accessToken);
//
//            return new ResponseEntity<>(invoice, HttpStatus.CREATED);
//        } catch (Exception e) {
//            // Handle exceptions properly (e.g., token fetch failure)
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
