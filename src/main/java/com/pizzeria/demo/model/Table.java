package com.pizzeria.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private int number;
    private int maxCovers;
    private String status; // "occupied" or "free"

}
