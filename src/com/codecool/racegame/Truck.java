package com.codecool.racegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Truck {
    private int distanceTraveled;
    private static Random random = new Random();
    private static List<String> truckNames = new ArrayList<>();
    private String name;
    private int breakDownTurnsLeft = 0;

    Truck() {
        boolean checkName = true;
        while (checkName) {
            int n = random.nextInt(1001);
            name = "Truck " + n;
            checkName = truckNames.contains(name);
        }
        truckNames.add(name);
    }
    void moveForAnHour(boolean broken) {
        if (this.breakDownTurnsLeft != 0) {
            this.breakDownTurnsLeft --;
        }
        else {
            if (broken) {
                this.breakDownTurnsLeft = 2;
            }
            else {
                distanceTraveled += 100;
            }
        }
    }
    int getDis() {
        return distanceTraveled;
    }
    String getName() {
        return name;
    }
}
