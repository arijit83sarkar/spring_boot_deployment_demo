package com.raven.spring_boot_deployment_demo.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    private UUID productId;
    private String name;
    private BigDecimal unitPrice;
    private int stockSize;
    private String unit;

    public Product(UUID productId, String name, BigDecimal unitPrice, int stockSize, String unit) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockSize = stockSize;
        this.unit = unit;
    }

    public UUID getProductId() {
        return productId;
    }

    public Product setProductId(UUID productId) {
        this.productId = productId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Product setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public int getStockSize() {
        return stockSize;
    }

    public Product setStockSize(int stockSize) {
        this.stockSize = stockSize;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public Product setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", stockSize=" + stockSize +
                ", unit='" + unit + '\'' +
                '}';
    }
}
