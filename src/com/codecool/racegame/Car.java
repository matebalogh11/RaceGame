package com.codecool.racegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Car {
    private int distanceTraveled;
    private String name;
    private int normalSpeed;
    private static int score;
    private static List<String> carNames = new ArrayList<>();
    private static final String[] carTypes = new String[]{"Flow", "Alabaster", "Marvel", "Legacy",
            "Lightning", "Freedom", "Stardust", "Paragon", "Resolve", "Whim"};

    static void setSpeedLimit(int limit) {
        double n = Math.random();
        score = (n >= 0.7) ? limit : 0;
    }
    Car() {
        Random random = new Random();
        normalSpeed = (score == 0) ? random.nextInt(31) + 80 : score;
        boolean checkName = true;
        while (checkName) {
            int index1 = random.nextInt(9);
            int index2 = random.nextInt(9);
            name = carTypes[index1] + " " + carTypes[index2];
            checkName = carNames.contains(name);
        }
        carNames.add(name);
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
