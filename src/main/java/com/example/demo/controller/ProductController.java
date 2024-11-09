package com.example.demo.controller;

import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Get all products
    @GetMapping
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        List<ProductModel> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    // Get product by ID
    @GetMapping("/get-product-by-id/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable("id") UUID productId) {
        Optional<ProductModel> product = productService.getProductById(productId);
        return product.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Get product by barCode
    @GetMapping("/get-product-by-barcode/{barcode}")
    public ResponseEntity<ProductModel> getProductByBarCode(@PathVariable("barcode") String barcode) {
        Optional<ProductModel> product = productService.getProductByBarCode(barcode);
        return product.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

//     Create a new product
//    @PostMapping
//    public ResponseEntity<ProductModel> createProduct(@RequestBody ProductModel product) {
//        log.info("Received product: {}", product);
//        ProductModel createdProduct = productService.createProduct(product);
//        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
//    }

    // Update an existing product
//    @PutMapping("/{id}")
//    public ResponseEntity<ProductModel> updateProduct(@PathVariable("id") UUID productId, @RequestBody ProductModel updatedProduct) {
//        ProductModel updated = productService.updateProduct(productId, updatedProduct);
//        return ResponseEntity.ok(updated);
//    }

    // Delete a product
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteProduct(@PathVariable("id") UUID productId) {
//        productService.deleteProduct(productId);
//        return ResponseEntity.noContent().build();
//    }
}
