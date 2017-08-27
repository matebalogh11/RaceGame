package com.codecool.racegame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Car> cars = new ArrayList<>();
    private static List<Motorcycle> bikes = new ArrayList<>();
    private static List<Truck> trucks = new ArrayList<>();

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }
    private static void printRaceResults() {
        cars.sort((o1, o2) -> o2.getDis() - o1.getDis());
        bikes.sort((o1, o2) -> o2.getDis() - o1.getDis());
        trucks.sort((o1, o2) -> o2.getDis() - o1.getDis());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Name: " + cars.get(i).getName() + ", distance: " + cars.get(i).getDis() + "km" + ", type: car.");
            System.out.println("Name: " + bikes.get(i).getName() + ", distance: " + bikes.get(i).getDis() + "km" + ", type: bike.");
            System.out.println("Name: " + trucks.get(i).getName() + ", distance: " + trucks.get(i).getDis() + "km" + ", type: truck.");
        }
    }
    private static void createVehicles() {
        for (int i = 0; i < 10; i++) {
            Car.setSpeedLimit(70);
            cars.add(new Car());
            bikes.add(new Motorcycle());
            trucks.add(new Truck());
        }
    }
    private static void simulateRace() {
        for (int j = 0; j < 50; j++) {
            double n = Math.random();
            boolean isRaining = (n >= 0.7);
            for (int i = 0; i < cars.size(); i++) {
                double m = Math.random();
                boolean brokenTruck = (m <= 0.05);
                cars.get(i).moveForAnHour();
                bikes.get(i).moveForAnHour(isRaining);
                trucks.get(i).moveForAnHour(brokenTruck);
            }
        }
    }
}
