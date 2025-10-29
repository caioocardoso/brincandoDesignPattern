package org.example;

import org.example.model.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Carrasso");
        car.setYear(1900);

        Car car2 = (Car) car.clone();

        System.out.println(car2.getModel() + car2.getYear());
    }
}