package com.raven.spring_boot_deployment_demo.controller;

import com.raven.spring_boot_deployment_demo.model.Product;
import com.raven.spring_boot_deployment_demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<Product>> getProduct(@RequestParam String name) {
        return new ResponseEntity<>(productService.getProduct(name), HttpStatus.OK);
    }
}
