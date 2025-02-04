package com.pizzeria.demo.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private int orderNumber;
    private String status; // "in progress", "ready", "served"
    private int numberOfCovers;
    private LocalDateTime acquisitionTime;
    private List<MenuItem> items = new ArrayList<>();
    private double totalAmount;
    private double coverCost;

    public Order(int orderNumber, String status, int numberOfCovers, LocalDateTime acquisitionTime, double coverCost) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.numberOfCovers = numberOfCovers;
        this.acquisitionTime = acquisitionTime;
        this.coverCost = coverCost;
        calculateTotalAmount();
    }

    public void addItem(MenuItem item) {
        items.add(item);
        calculateTotalAmount();
    }

    private void calculateTotalAmount() {
        totalAmount = items.stream().mapToDouble(MenuItem::getPrice).sum();
        totalAmount += numberOfCovers * coverCost;
    }

}