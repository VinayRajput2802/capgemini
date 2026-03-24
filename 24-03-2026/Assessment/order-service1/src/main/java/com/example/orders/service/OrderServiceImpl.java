package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.hibernate.query.Order;
import org.springframework.expression.spel.ast.OpInc;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Optional.empty;

@Service
public class OrderServiceImpl implements OrderService {
    OrderRepository repo;

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
        OrderEntity order = OrderMapper.toEntity(request);
        return repo.save(order);

    }

    @Override
    public OrderEntity getOrderById(Long id){
        Optional<OrderEntity> ord = repo.findById(id);
        if (ord.isEmpty()){
            throw new OrderNotFoundException();
        }
        else{
            return ord.get();
        }
    }

    @Override
    public void deleteOrder(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        }
        else{
            throw new OrderNotFoundException();
        }
    }

}
