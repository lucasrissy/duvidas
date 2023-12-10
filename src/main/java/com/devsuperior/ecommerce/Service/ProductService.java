package com.devsuperior.ecommerce.Service;

import com.devsuperior.ecommerce.DTO.Mapper.ProductMapper;
import com.devsuperior.ecommerce.DTO.ProductDTO;
import com.devsuperior.ecommerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper mapper;

    public List<ProductDTO> findALL(){
        return productRepository.findAll().stream()
                .map(e -> mapper.convertToDTO(e))
                .toList();
    }

}
