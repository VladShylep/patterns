package org.example;

public class CoffeeMaker {

    private int water;
    private int coffeeSeeds;

    WaterHeater waterHeater;

    CoffeeBlender coffeeBlender;

    public CoffeeMaker() {
        this.water = 0;
        this.coffeeSeeds = 0;

        waterHeater = new WaterHeater();
        coffeeBlender = new CoffeeBlender();
    }

    public Coffee makesEspresso() throws Exception {
        if (this.water < 100) {
            throw new LowWaterException();
        }

        if (this.coffeeSeeds < 3) {
            throw new LowSeedsException();
        }

        int hotWater = waterHeater.heat(100);
        this.water -= 100;
        int blendedSeeds = coffeeBlender.blend(3);
        this.coffeeSeeds -= 3;
        return new Coffee(hotWater, blendedSeeds, "Espresso");

    }

    public Coffee makeCappuccino() throws Exception {
        if (this.water < 200) {
            throw new LowWaterException();
        }

        if (this.coffeeSeeds < 5) {
            throw new LowSeedsException();
        }

        int hotWater = waterHeater.heat(200);
        this.water -= 200;
        int blendedSeeds = coffeeBlender.blend(5);
        this.coffeeSeeds -= 5;
        return new Coffee(hotWater, blendedSeeds, "Cappuccino");
    }

    public void addWater(int water) {
        System.out.println("Dolewam wode");
        this.water += water;
    }

    public void addSeeds(int coffeeSeeds) {
        System.out.println("Dosypuje kawe");
        this.coffeeSeeds += coffeeSeeds;
    }

    static class LowWaterException extends Exception {
        LowWaterException() {
            super("Nie ma wody");
        }
    }

    static class LowSeedsException extends Exception {
        LowSeedsException() {
            super("Nie ma kawuni");
        }
    }

}
