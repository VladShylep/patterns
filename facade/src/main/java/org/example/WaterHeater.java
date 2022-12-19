package org.example;

public class WaterHeater {

    public WaterHeater() {

    }

    public int heat(int water){
        System.out.println("kurwa, poczekaj, grzeje przecież kurwa wodę");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Popsuła sie grzałka");
        }

        return water;
    }
}
