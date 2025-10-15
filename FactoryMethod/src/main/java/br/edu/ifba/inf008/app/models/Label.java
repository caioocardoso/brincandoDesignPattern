package br.edu.ifba.inf008.app.models;

public class Label implements Widget {
    @Override
    public void create() {
        System.out.println("Label created");
    }

    @Override
    public void draw() {
        System.out.println("Label drawn");
    }
}