package org.example.model;

import org.example.Clonable;

public class Car implements Clonable {
    private String model;
    private int year;

    public Car(){}

    public Car(Car car){
        this.model = car.model;
        this.year = car.year;
    }

    @Override
    public Clonable clone() {
        return new Car(this);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
