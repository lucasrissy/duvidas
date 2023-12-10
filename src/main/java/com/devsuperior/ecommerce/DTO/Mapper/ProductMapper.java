package com.devsuperior.ecommerce.DTO.Mapper;

import com.devsuperior.ecommerce.DTO.ProductDTO;
import com.devsuperior.ecommerce.Entities.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class ProductMapper extends ModelMapper {

    public ProductDTO convertToDTO(Product product){
        return map(product,ProductDTO.class);
    }

    public Product convertToEntity(ProductDTO productDTO){
        return map(productDTO,Product.class);
    }
}
