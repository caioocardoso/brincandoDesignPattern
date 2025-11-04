package org.example.model;

import org.example.Clonable;
import org.example.Shapes.Shape;

public class Rectangle implements Shape {
    private String model;
    private int year;

    public Rectangle(){}

    public Rectangle(org.example.model.Rectangle rectangle){
        this.model = rectangle.model;
        this.year = rectangle.year;
    }

    @Override
    public Clonable clone() {
        return new org.example.model.Rectangle(this);
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
