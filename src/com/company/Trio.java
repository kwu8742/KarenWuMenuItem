package com.company;

public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    public Trio(Sandwich sand, Salad sal, Drink dr) {
        sandwich = sand;
        salad = sal;
        drink = dr;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
