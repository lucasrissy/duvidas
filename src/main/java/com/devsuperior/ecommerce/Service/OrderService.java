package com.devsuperior.ecommerce.Service;

import com.devsuperior.ecommerce.DTO.Mapper.OrderMapper;
import com.devsuperior.ecommerce.DTO.OrderDTO;
import com.devsuperior.ecommerce.Repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMapper mapper;

    public List<OrderDTO> findAll(){
        return orderRepository.findAll().stream()
                .map(e -> mapper.convertToDTO(e))
                .toList();
    }
}
