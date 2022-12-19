package org.example;

public class HenrykCoffeeService {
    CoffeeMaker coffeeMaker;

    HenrykCoffeeService() {
        this.coffeeMaker = new CoffeeMaker();
        this.coffeeMaker.addWater(200);
        this.coffeeMaker.addSeeds(5);
    }

    public Coffee goToShop(){
        return new Coffee(200, 2, "Lungo");
    }

    public Coffee makeMeCoffee(String coffeeKind) throws NoMoneyNoCoffee {
        Coffee coffee = null;
        if (coffeeKind.equals("Espresso") || coffeeKind.equals("Cappuccino")) {
            try {
                coffee = this.serveCoffeeMaker(coffeeKind);
            } catch (Exception e) {
                this.coffeeMaker.addSeeds(8);
                this.coffeeMaker.addWater(300);

                try {
                    coffee = this.serveCoffeeMaker(coffeeKind);
                } catch (Exception e1) {
                    throw new NoMoneyNoCoffee();
                }
            }
        } else {
            throw new NoMoneyNoCoffee();
        }
        return coffee;
    }

    private Coffee serveCoffeeMaker(String coffeeKind) throws Exception {
        Coffee coffee = null;
        if (coffeeKind.equals("Espresso")) {
            coffee = coffeeMaker.makesEspresso();
        } else if (coffeeKind.equals("Cappuccino")) {
            coffee = coffeeMaker.makeCappuccino();
        }
        return coffee;
    }


    static class NoMoneyNoCoffee extends Exception {
        NoMoneyNoCoffee() {
            super("kawy, to moge zrobic, ale taskow to robic nie bede");
        }
    }
}
