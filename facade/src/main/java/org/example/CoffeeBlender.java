package org.example;

public class CoffeeBlender {

    public CoffeeBlender() {

    }

    public int blend(int coffeeSeeds) {
        System.out.println("miele, miele,miele....ulalala");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}

        return coffeeSeeds;
    }
}
