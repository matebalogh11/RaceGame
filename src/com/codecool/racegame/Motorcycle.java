package com.codecool.racegame;

import java.util.Random;

class Motorcycle {
    private int distanceTraveled;
    private static Random random = new Random();
    private static int nameNumber = 0;
    private String name;

    Motorcycle() {
        nameNumber ++;
        name = "Motorcycle " + nameNumber;
    }
    void moveForAnHour(boolean rainEvent) {
        int normalSpeed = 100;
        if (rainEvent) {
            int n = random.nextInt(46) + 5;
            distanceTraveled += (normalSpeed - n);
        } else {
            distanceTraveled += normalSpeed;
        }
    }
    int getDis() {
        return distanceTraveled;
    }
    String getName() {
        return name;
    }
}
