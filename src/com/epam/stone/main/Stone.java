package com.epam.stone.main;

/**
 * Created by Шынар on 11.08.2015.
 */
public abstract class Stone {
    private String name;
    private  double weight;
    private int price;

    public Stone(String name, double weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Stone (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
