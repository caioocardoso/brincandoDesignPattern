package br.edu.ifba.inf008.app.models;

public class LabelWindows implements Label {
    @Override
    public void create() {
        System.out.println("Windows Label created");
    }

    @Override
    public void draw() {
        System.out.println("Windows Label drawn");
    }
}