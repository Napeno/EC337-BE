package com.example.demo.repository;

import com.example.demo.model.TransactionModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionModule, String> {
}
