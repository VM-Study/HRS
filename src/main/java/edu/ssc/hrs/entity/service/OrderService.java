package edu.ssc.hrs.entity.service;

import edu.ssc.hrs.entity.Order;
import edu.ssc.hrs.entity.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

    public Order createOrder(List<Long> productServiceIds) {
        return null;
    }

    public void updateOrderStatus(Long orderId, String newStatus) {
    }
}

