package br.edu.ifba.inf008.app.models;

public class ButtonMac implements Button{
    @Override
    public void create() {
        System.out.println("Mac Button created");
    }

    @Override
    public void draw() {
        System.out.println("Mac Button drawn");
    }
}
