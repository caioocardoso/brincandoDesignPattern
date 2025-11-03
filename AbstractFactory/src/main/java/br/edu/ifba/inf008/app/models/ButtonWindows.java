package br.edu.ifba.inf008.app.models;

public class ButtonWindows implements Button{
    @Override
    public void create() {
        System.out.println("Windows Button created");
    }

    @Override
    public void draw() {
        System.out.println("Windows Button drawn");
    }
}
