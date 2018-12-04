package com.company;

public class Salad implements MenuItem {
    private String name;
    private double price;
    public Salad(double price, String name) {
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
