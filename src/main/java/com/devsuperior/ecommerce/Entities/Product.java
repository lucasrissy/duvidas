package com.devsuperior.ecommerce.Entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) //campo unico que não se repete
    private String name;

    @Column(columnDefinition = "TEXT") // permite um texto longo
    private String description;

    @Column(name = "price")
    private Double suggestedPrice;


    @OneToMany(mappedBy = "id.product", fetch = FetchType.EAGER)
    private Set<OrderItem> items = new HashSet<>();

    public Product() {

    }

    public Product(Long id, String name, String description, Double suggestedPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.suggestedPrice = suggestedPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSuggestedPrice() {
        return suggestedPrice;
    }

    public void setSuggestedPrice(Double suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public List<Order> orders(){
        return items.stream().map(e -> e.getOrder()).toList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(suggestedPrice, product.suggestedPrice)  && Objects.equals(items, product.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, suggestedPrice, items);
    }
}
