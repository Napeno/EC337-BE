package com.example.demo.repository;

import com.example.demo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
    Optional<ProductModel> findByBarcode(String barcode);
}
