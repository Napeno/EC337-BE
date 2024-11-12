package com.example.demo.service;

import com.example.demo.model.PaymentModule;
import com.example.demo.model.TransactionModule;
import com.example.demo.model.WebhookData;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    public PaymentModule savePayment(WebhookData webhookData) {
        // Chuyển dữ liệu từ WebhookData sang Payment entity
        PaymentModule payment = new PaymentModule();
        payment.setId(webhookData.getData().getId());
        payment.setOrderCode(webhookData.getData().getOrderCode());
        payment.setAmount(webhookData.getData().getAmount());
        payment.setAmountPaid(webhookData.getData().getAmountPaid());
        payment.setAmountRemaining(webhookData.getData().getAmountRemaining());
        payment.setStatus(webhookData.getData().getStatus());
        payment.setCreatedAt(webhookData.getData().getCreatedAt());
        payment.setCanceledAt(webhookData.getData().getCanceledAt());
        payment.setCancellationReason(webhookData.getData().getCancellationReason());

        // Lưu Payment
        PaymentModule savedPayment = paymentRepository.save(payment);

        // Chuyển và lưu danh sách Transaction liên kết với Payment
        List<TransactionModule> transactions = webhookData.getData().getTransactions().stream().map(txData -> {
            TransactionModule transaction = new TransactionModule();
            transaction.setReference(txData.getReference());
            transaction.setAccountNumber(txData.getAccountNumber());
            transaction.setAmount(txData.getAmount());
            transaction.setCounterAccountBankId(txData.getCounterAccountBankId());
            transaction.setCounterAccountBankName(txData.getCounterAccountBankName());
            transaction.setCounterAccountName(txData.getCounterAccountName());
            transaction.setCounterAccountNumber(txData.getCounterAccountNumber());
            transaction.setDescription(txData.getDescription());
            transaction.setTransactionDateTime(txData.getTransactionDateTime());
            transaction.setVirtualAccountName(txData.getVirtualAccountName());
            transaction.setVirtualAccountNumber(txData.getVirtualAccountNumber());
            transaction.setPayment(savedPayment);
            return transaction;
        }).collect(Collectors.toList());

        transactionRepository.saveAll(transactions);

        return savedPayment;
    }

    public List<PaymentModule> getAllPayments() {
        return paymentRepository.findAll();
    }
}
