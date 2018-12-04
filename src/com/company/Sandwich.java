package com.company;

public class Sandwich implements MenuItem {
    private String name;
    private double price;
    public Sandwich(double price, String name) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
