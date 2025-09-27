package com.raven.spring_boot_deployment_demo.service;

import com.raven.spring_boot_deployment_demo.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    public List<Product> getProduct(String name) {
        return this.getProducts().stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

    public List<Product> getProducts() {
        return List.of(
                new Product(UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"), "Organic Apples", new BigDecimal("2.49"), 120, "kg"),
                new Product(UUID.fromString("6fa459ea-ee8a-3ca4-894e-db77e160355e"), "Mineral Water", new BigDecimal("0.99"), 500, "liter"),
                new Product(UUID.fromString("16fd2706-8baf-433b-82eb-8c7fada847da"), "Brown Eggs", new BigDecimal("3.19"), 200, "dozen"),
                new Product(UUID.fromString("e02fa0e4-01ad-090A-c130-0d05e0008ba0"), "Whole Milk", new BigDecimal("1.49"), 300, "liter"),
                new Product(UUID.fromString("f9168c5e-ceb2-4faf-8dd5-1c6161a0f5a3"), "All-Purpose Flour", new BigDecimal("1.99"), 150, "kg"),
                new Product(UUID.fromString("c9bf9e57-1685-4c89-bafb-ff5af830be8a"), "Granulated Sugar", new BigDecimal("1.29"), 180, "kg"),
                new Product(UUID.fromString("123e4567-e89b-12d3-a456-426614174000"), "Black Coffee Beans", new BigDecimal("8.99"), 80, "kg"),
                new Product(UUID.fromString("7d444840-9dc0-11d1-b245-5ffdce74fad2"), "Green Tea Bags", new BigDecimal("4.49"), 220, "box"),
                new Product(UUID.fromString("54947df8-0e9e-4471-a2f9-9af509fb5889"), "Cheddar Cheese", new BigDecimal("5.99"), 90, "kg"),
                new Product(UUID.fromString("2c1d7a1f-7cfa-4d8a-9fbf-d6c8ef5a0e5b"), "Cherry Tomatoes", new BigDecimal("3.59"), 130, "kg"),
                new Product(UUID.fromString("3c86b8c0-9feb-4a3f-8a7f-2d2f1c0e9ad7"), "Almond Butter", new BigDecimal("12.49"), 60, "jar"),
                new Product(UUID.fromString("4b825dc6-8a62-4b9b-9a3b-3d7b1f5f6e2c"), "Olive Oil", new BigDecimal("10.99"), 75, "liter"),
                new Product(UUID.fromString("5a1d3e44-b6a5-4c55-8e5c-8ee6a4b6c9f1"), "Brown Rice", new BigDecimal("2.79"), 140, "kg"),
                new Product(UUID.fromString("6b1a2c72-9d4e-4d1f-8c5a-7b9e4f1a2c3d"), "Oatmeal", new BigDecimal("3.29"), 110, "kg"),
                new Product(UUID.fromString("7c2e3f84-8f5b-4a6c-9d7a-6f8e9b1c2d3e"), "Greek Yogurt", new BigDecimal("0.89"), 250, "cup")
        );
    }
}
