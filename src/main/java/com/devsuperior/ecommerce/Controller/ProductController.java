package com.devsuperior.ecommerce.Controller;

import com.devsuperior.ecommerce.DTO.ProductDTO;
import com.devsuperior.ecommerce.Entities.Product;
import com.devsuperior.ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> getAll(){
        return productService.findALL();
    }
}
