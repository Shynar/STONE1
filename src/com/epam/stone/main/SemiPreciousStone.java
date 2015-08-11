package com.epam.stone.main;

/**
 * Created by Шынар on 12.08.2015.
 */
public class SemiPreciousStone extends Stone {
    private double hardness;

    public SemiPreciousStone(String name, double weight, int price, double hardness) {
        super(name, weight, price);
        this.hardness = hardness;
    }

    public double getHardness() {
        return hardness;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "SemiPreciousStone{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                ", hardness=" + hardness +
                '}';
    }
}
