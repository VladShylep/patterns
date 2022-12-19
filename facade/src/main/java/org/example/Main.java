package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        CoffeeMaker coffeeMaker = new CoffeeMaker();
//        coffeeMaker.addWater(200);
//        coffeeMaker.addSeeds(5);
//
//        Coffee coffee;
//
//        try {
//            coffee = coffeeMaker.makeCappuccino();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(coffee);
//
////-----------------------------------
//        Coffee coffee1;
//        try {
//            coffee1 = coffeeMaker.makesEspresso();
//        } catch (CoffeeMaker.LowWaterException e) {
//            coffeeMaker.addWater(300);
//
//            try {
//                coffee1 = coffeeMaker.makesEspresso();
//            } catch (CoffeeMaker.LowSeedsException e1) {
//                coffeeMaker.addSeeds(8);
//
//                try {
//                    coffee1 = coffeeMaker.makesEspresso();
//                } catch (Exception e2) {
//                    throw new RuntimeException(e);
//                }
//
//            } catch (Exception e1) {
//                throw new RuntimeException(e);
//            }
//
//        } catch (CoffeeMaker.LowSeedsException e) {
//            coffeeMaker.addSeeds(8);
//
//            try {
//                coffee1 = coffeeMaker.makesEspresso();
//            } catch (Exception e1) {
//                throw new RuntimeException(e);
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }



        HenrykCoffeeService h = new HenrykCoffeeService();

        try{
            System.out.println(h.makeMeCoffee("hhs"));
        }catch (Exception e){
            System.out.println(h.goToShop());
        }





    }
}