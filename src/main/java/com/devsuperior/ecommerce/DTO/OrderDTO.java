package com.devsuperior.ecommerce.DTO;

import com.devsuperior.ecommerce.Entities.Client;
import com.devsuperior.ecommerce.Entities.OrderItem;
import com.devsuperior.ecommerce.Entities.Product;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Set;

@Component
public class OrderDTO {

    private Long id;
    private Instant moment;
    private Client client;
    private Set<Product> products;

    public OrderDTO(Long id, Instant moment, Client client,Set<Product> products, OrderItem orderItem) {
        this.id = id;
        this.moment = moment;
        this.client = client;
        this.products = products;
    }

    public OrderDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
