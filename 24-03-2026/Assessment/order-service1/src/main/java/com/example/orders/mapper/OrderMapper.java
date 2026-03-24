package com.example.orders.mapper;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;


public class OrderMapper {

    public static OrderEntity toEntity(OrderRequestDTO dto) {
        OrderEntity e = new OrderEntity();
        e.setQuantity(dto.getQuantity());
        e.setEmail(dto.getEmail());
        e.setProductName(dto.getProductName());
        e.setPricePerUnit(dto.getPricePerUnit());
        e.setCustomerName(dto.getCustomerName());


        return e;
    }

    public static OrderResponseDTO toResponseDTO(OrderEntity entity) {
        OrderResponseDTO dto = new OrderResponseDTO();
        dto.setTotalAmount(entity.getTotalAmount());
        dto.setCustomerName(entity.getCustomerName());
        dto.setEmail(entity.getEmail());
        dto.setQuantity(entity.getQuantity());
        dto.setProductName(entity.getProductName());
        dto.setPricePerUnit(entity.getPricePerUnit());
        dto.setOrderId(entity.getId());
        return dto;
    }
}
