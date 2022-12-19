package org.example;

public class Coffee {

    private int water;
    private int coffeeSeeds;
    private String name;

    Coffee(int water, int coffeeSeeds, String name) {
        this.coffeeSeeds = coffeeSeeds;
        this.water = water;
        this.name = name;


    }

    @Override
    public String toString() {
        return "Coffee{" +
                "water=" + water +
                ", coffeeSeeds=" + coffeeSeeds +
                ", name='" + name + '\'' +
                '}';
    }
}
