package br.edu.ifba.inf008.app.fabric;

import br.edu.ifba.inf008.app.models.*;

public class WindowsFabric implements Factory {
    @Override
    public Widget createButton() {
        return new ButtonWindows();
    }

    @Override
    public Widget createLabel() {
        return new LabelWindows();
    }
}
