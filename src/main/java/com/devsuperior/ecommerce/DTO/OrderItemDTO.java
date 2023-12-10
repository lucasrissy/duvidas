package com.devsuperior.ecommerce.DTO;

import org.springframework.stereotype.Component;

@Component
public class OrderItemDTO {

    private Integer quantity;
    private Double price;

    public OrderItemDTO(){}

    public OrderItemDTO(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
