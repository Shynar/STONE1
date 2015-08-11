package com.epam.stone.main;

/**
 * Created by Шынар on 12.08.2015.
 */
public class PreciousStone extends Stone{
    private double transparency;

    public PreciousStone(String name, double weight, int price, double transparency) {
        super(name, weight, price);
        this.transparency = transparency;
    }

    public double getTransparency() {
        return transparency;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    @Override
    public String toString() {
        return "PreciousStone{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", price=" + getPrice() +
                ", transparency=" + transparency +
                '}';
    }
}
