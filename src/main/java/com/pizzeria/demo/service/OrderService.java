package com.pizzeria.demo.service;

import com.pizzeria.demo.model.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> orders = new ArrayList<>();

    public Order createOrder(int orderNumber, int numberOfCovers, double coverCost) {
        Order order = new Order(orderNumber, "in progress", numberOfCovers, LocalDateTime.now(), coverCost);
        orders.add(order);
        return order;
    }

    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
    }

    public List<Order> getOrders() {
        return orders;
    }
}