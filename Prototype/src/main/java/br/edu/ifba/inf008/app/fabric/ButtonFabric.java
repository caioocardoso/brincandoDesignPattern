package br.edu.ifba.inf008.app.fabric;

import br.edu.ifba.inf008.app.models.Button;
import br.edu.ifba.inf008.app.models.Widget;

public class ButtonFabric implements AbstractFactory {
    
    public Widget create() {
        return new Button();
    }
}
