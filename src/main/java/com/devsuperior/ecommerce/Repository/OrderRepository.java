package com.devsuperior.ecommerce.Repository;

import com.devsuperior.ecommerce.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
