package com.example.first.service;

import com.example.first.entity.CustomerOrder;
import com.example.first.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<CustomerOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<CustomerOrder> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public CustomerOrder createOrder(CustomerOrder order) {
        return orderRepository.save(order);
    }

    public CustomerOrder updateOrder(Long id, CustomerOrder orderDetails) {
        CustomerOrder order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setDescription(orderDetails.getDescription());
        order.setPrice(orderDetails.getPrice());
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

}
