package com.example.demo.service;

import com.example.demo.model.ProductModel;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductModel> getAllProducts() {
        List<ProductModel> products = productRepository.findAll();
        System.out.println("Retrieved products: " + products);
        return products;
    }


    public Optional<ProductModel> getProductById(UUID productId) {
        return productRepository.findById(productId);
    }

    public Optional<ProductModel> getProductByBarCode(String barcode) {
        return productRepository.findByBarcode(barcode);
    }

    public ProductModel createProduct(ProductModel product) {
        return productRepository.save(product);
    }

    public ProductModel updateProduct(UUID productId, ProductModel updatedProduct) {
        updatedProduct.setProductId(productId);
        return productRepository.save(updatedProduct);
    }

    public void deleteProduct(UUID productId) {
        productRepository.deleteById(productId);
    }
}
