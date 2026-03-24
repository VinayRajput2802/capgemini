package com.example.orders.controller;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.service.OrderService;
import jakarta.validation.Valid;
import org.aspectj.weaver.ast.Or;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")

public class OrderController {

    @Autowired
    OrderService service;

    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@Valid @RequestBody OrderRequestDTO request) {
       OrderEntity entity = service.createOrder(request);
       OrderResponseDTO responseDTO = OrderMapper.toResponseDTO(entity);
       return new ResponseEntity<>(responseDTO,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) {
    	OrderEntity entity = service.getOrderById(id);
        return new ResponseEntity<>(OrderMapper.toResponseDTO(entity),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
    	service.deleteOrder(id);
        return new ResponseEntity<>("Order deleted successfully",HttpStatus.OK);
    }
}
