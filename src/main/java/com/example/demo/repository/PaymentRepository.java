package com.example.demo.repository;

import com.example.demo.model.PaymentModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentModule, String> {
}
