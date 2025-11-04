package org.example;

public class Main {
    public static void main(String[] args) {
        org.example.model.Rectangle rectangle = new org.example.model.Rectangle();
        rectangle.setModel("Carrasso");
        rectangle.setYear(1900);

        org.example.model.Rectangle rectangle2 = (org.example.model.Rectangle) rectangle.clone();

        System.out.println(rectangle2.getModel() + rectangle2.getYear());
    }
}