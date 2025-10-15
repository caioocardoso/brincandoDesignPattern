package br.edu.ifba.inf008.app.models;

public class Button implements Widget {
    @Override
    public void create() {
        System.out.println("Button created");
    }

    @Override
    public void draw() {
        System.out.println("Button drawn");
    }
}