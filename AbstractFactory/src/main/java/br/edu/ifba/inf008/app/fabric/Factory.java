package br.edu.ifba.inf008.app.fabric;

import br.edu.ifba.inf008.app.models.Button;
import br.edu.ifba.inf008.app.models.Label;
import br.edu.ifba.inf008.app.models.Widget;

public interface Factory {
    public Widget createButton();
    public Widget createLabel();
}
