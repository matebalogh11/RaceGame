package com.codecool.racegame;

import java.util.Random;

class Car {
    private static Random random = new Random();
    private int distanceTraveled;
    private String name;
    private int normalSpeed;
    private static int score;

    static void setSpeedLimit(int limit) {
        double n = Math.random();
        score = (n >= 0.7) ? limit : 0;
    }
    Car() {
        normalSpeed = (score == 0) ? random.nextInt(31) + 80 : score;
        int index1 = random.nextInt(9);
        int index2 = random.nextInt(9);
        String[] carTypes = new String[]{"Flow", "Alabaster", "Marvel", "Legacy",
                "Lightning", "Freedom", "Stardust", "Paragon", "Resolve", "Whim"};
        name = carTypes[index1] + " " + carTypes[index2];
    }
    void moveForAnHour() {
        distanceTraveled += normalSpeed;
    }
    String getName() {
        return name;
    }
    int getDis() {
        return distanceTraveled;
    }
}
