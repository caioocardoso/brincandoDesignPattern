package br.edu.ifba.inf008.app.models;

public class LabelMac implements Label {
    @Override
    public void create() {
        System.out.println("Mac Label created");
    }

    @Override
    public void draw() {
        System.out.println("Mac Label drawn");
    }
}