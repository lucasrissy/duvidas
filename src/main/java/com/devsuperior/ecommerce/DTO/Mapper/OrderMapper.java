package com.devsuperior.ecommerce.DTO.Mapper;

import com.devsuperior.ecommerce.DTO.OrderDTO;
import com.devsuperior.ecommerce.Entities.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper extends ModelMapper {

    public OrderDTO convertToDTO(Order order){
        return map(order,OrderDTO.class);
    }

    public Order convertToEntity(OrderDTO orderDTO){
        return map(orderDTO,Order.class);
    }
}
