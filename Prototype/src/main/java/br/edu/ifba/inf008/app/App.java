package br.edu.ifba.inf008.app;

import br.edu.ifba.inf008.app.fabric.AbstractFactory;
import br.edu.ifba.inf008.app.fabric.ButtonFabric;
import br.edu.ifba.inf008.app.fabric.LabelFabric;
import br.edu.ifba.inf008.app.models.Widget;

public class App {
    public static void main(String[] args) {
        AbstractFactory factory;
        Widget widget;
        
        factory = new ButtonFabric();

        widget = factory.create();
        widget.create();
        widget.draw();

        factory = new LabelFabric();

        widget = factory.create();
        widget.create();
        widget.draw();
    }
}