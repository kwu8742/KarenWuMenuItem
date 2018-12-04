package com.company;

public class Drink implements MenuItem {
    private String name;
    private double price;
    public Drink(double price, String name) {
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
