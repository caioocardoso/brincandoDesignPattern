package br.edu.ifba.inf008.app.fabric;

import br.edu.ifba.inf008.app.models.*;

public class MacFabric implements Factory {
    @Override
    public Widget createButton() {
        return new ButtonMac();
    }

    @Override
    public Widget createLabel() {
        return new LabelMac();
    }
}
