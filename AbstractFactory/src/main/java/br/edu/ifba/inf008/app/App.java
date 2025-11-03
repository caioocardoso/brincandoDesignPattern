package br.edu.ifba.inf008.app;

import br.edu.ifba.inf008.app.fabric.Factory;
import br.edu.ifba.inf008.app.fabric.MacFabric;
import br.edu.ifba.inf008.app.fabric.WindowsFabric;
import br.edu.ifba.inf008.app.models.Widget;

public class App {
    public static void main(String[] args) {
        new App().run(new WindowsFabric());
        new App().run(new MacFabric());
    }

    public void run(Factory factory){
        System.out.println("-----------------------------");
        Widget widget;
        Widget widget2;

        widget = factory.createButton();
        widget2 = factory.createLabel();

        widget.create();
        widget.draw();
        widget2.create();
        widget2.draw();
    }
}