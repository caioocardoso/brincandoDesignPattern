package br.ifba.edu.aval1.builder;

import br.ifba.edu.aval1.model.*;

import java.util.ArrayList;
import java.util.List;

public class ListaPassagensBuilder extends Builder {
    List<TempoPassagem> tempos = new ArrayList<TempoPassagem>();

    @Override
    public Builder setListaPassagens(List<TempoPassagem> tempos) {
        this.tempos = tempos;
        return this;
    }

    public void init() {
        tempos = new ArrayList<>();
    }

    public ListaPassagens build() {
        ListaPassagens listaPassagens = new ListaPassagens(this.tempos);
        init();
        return listaPassagens;
    }
}
