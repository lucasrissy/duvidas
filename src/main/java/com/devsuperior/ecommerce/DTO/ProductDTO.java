package com.devsuperior.ecommerce.DTO;

import com.devsuperior.ecommerce.Entities.OrdemItemPK;
import com.devsuperior.ecommerce.Entities.OrderItem;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double suggestedPrice;

    public ProductDTO (){

    }

    public ProductDTO(Long id, String name, String description, Double suggestedPrice) {
        this.id =id;
        this.name = name;
        this.description = description;
        this.suggestedPrice = suggestedPrice;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
