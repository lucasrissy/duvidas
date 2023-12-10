package com.devsuperior.ecommerce.Repository;

import com.devsuperior.ecommerce.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
