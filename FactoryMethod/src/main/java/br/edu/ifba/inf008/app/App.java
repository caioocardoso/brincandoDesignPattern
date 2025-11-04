package br.edu.ifba.inf008.app;

import br.edu.ifba.inf008.app.fabric.Factory;
import br.edu.ifba.inf008.app.fabric.ButtonFabric;
import br.edu.ifba.inf008.app.fabric.LabelFabric;
import br.edu.ifba.inf008.app.models.Widget;

public class App {
    public static void main(String[] args) {
        new App().run(new ButtonFabric());
        new App().run(new LabelFabric());
    }

    public void run(Factory factory){
        Widget widget;

        widget = factory.create();
        widget.create();
        widget.draw();
    }
}