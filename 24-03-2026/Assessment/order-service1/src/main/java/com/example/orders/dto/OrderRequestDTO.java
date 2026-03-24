package com.example.orders.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class OrderRequestDTO {
    @NotBlank()
    private String customerName;
    @Email()
    private String email;
    @NotBlank()
    private String productName;
    @Min(0)
    private Integer quantity;
    @Min(0)
    private double pricePerUnit;

    public OrderRequestDTO() {
    }

    public OrderRequestDTO(String customerName, String email, String productName, Integer quantity, double pricePerUnit) {
        this.customerName = customerName;
        this.email = email;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
