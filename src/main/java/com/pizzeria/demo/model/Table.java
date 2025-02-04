package com.pizzeria.demo.model;

public class Table {
    private int number;
    private int maxCovers;
    private String status; // "occupied" or "free"

    public Table(int number, int maxCovers, String status) {
        this.number = number;
        this.maxCovers = maxCovers;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxCovers() {
        return maxCovers;
    }

    public void setMaxCovers(int maxCovers) {
        this.maxCovers = maxCovers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Table{" +
                "number=" + number +
                ", maxCovers=" + maxCovers +
                ", status='" + status + '\'' +
                '}';
    }
}
