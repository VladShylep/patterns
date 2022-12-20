package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws HenrykCoffeeService.NoMoneyNoCoffee {


        HenrykCoffeeService h = new HenrykCoffeeService();

        System.out.println(h.makeMeCoffee("Cappuccino"));
        System.out.println(h.makeMeCoffee("Cappuccino"));
        System.out.println(h.makeMeCoffee("Espresso"));
        System.out.println(h.makeMeCoffee("Espresso"));
        System.out.println(h.makeMeCoffee("SMU-13901"));


//        try{
//            System.out.println(h.makeMeCoffee("hhs"));
//        }catch (Exception e){
//            System.out.println(h.goToShop());
//        }





    }
}