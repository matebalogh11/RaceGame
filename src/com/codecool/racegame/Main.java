package com.codecool.racegame;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private static List<Car> cars = new LinkedList<>();
    private static List<Motorcycle> bikes = new LinkedList<>();

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }
    private static void printRaceResults() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Name: " + cars.get(i).getName() + ", distance: " + cars.get(i).getDis() + "km" + ", type: car.");
            System.out.println("Name: " + bikes.get(i).getName() + ", distance: " + bikes.get(i).getDis() + "km" + ", type: bike.");
        }
    }
    private static void createVehicles() {
        int counter = 0;
        while (counter < 10) {
            Car.setSpeedLimit(70);
            cars.add(new Car());
            bikes.add(new Motorcycle());
            counter++;
        }
    }
    private static void simulateRace() {
        int counter = 0;
        while (counter <= 50) {
            double n = Math.random();
            boolean isRaining = (n >= 0.7);
            for (int i = 0; i < cars.size(); i++) {
                cars.get(i).moveForAnHour();
                bikes.get(i).moveForAnHour(isRaining);
            }
            counter++;
        }
    }
}
