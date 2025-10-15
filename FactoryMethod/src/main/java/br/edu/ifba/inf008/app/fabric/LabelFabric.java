package br.edu.ifba.inf008.app.fabric;

import br.edu.ifba.inf008.app.models.Label;
import br.edu.ifba.inf008.app.models.Widget;

public class LabelFabric implements AbstractFactory {
    public Widget create() {
        return new Label();
    }
}
