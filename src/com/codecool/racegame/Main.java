package com.codecool.racegame;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private static boolean isRaining;
    private static List<Car> cars = new LinkedList<>();

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }
    private static void printRaceResults() {
        for (Car car: cars) {
            System.out.println("Name: " + car.getName() + ", distance: " + car.getDis() + "km" + ", type: car.");
        }
    }
    private static void createVehicles() {
        int counter = 0;
        while (counter <= 10) {
            Car.setSpeedLimit(70);
            cars.add(new Car());
            counter++;
        }
    }
    private static void simulateRace() {
        int counter = 0;
        while (counter <= 50) {
            double n = Math.random();
            isRaining = (n >= 0.7);
            for (Car car : cars) {
                car.moveForAnHour();
            }
            counter++;
        }
    }
}
