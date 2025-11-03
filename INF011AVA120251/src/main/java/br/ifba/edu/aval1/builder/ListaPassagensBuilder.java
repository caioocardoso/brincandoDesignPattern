package br.ifba.edu.aval1.builder;

import br.ifba.edu.aval1.model.*;

import java.util.ArrayList;
import java.util.List;

public class ListaPassagensBuilder implements Builder {
    List<TempoPassagem> tempos = new ArrayList<TempoPassagem>();

    @Override
    public Builder setSexo(Sexo sexo) {
        return this;
    }

    @Override
    public Builder setIdade(Idade idade) {
        return this;
    }

    @Override
    public Builder setDificuldade(Dificuldade dificuldade) {
        return this;
    }

    @Override
    public Builder setDistancia(Double valor) {
        return this;
    }

    @Override
    public Builder setDesnivel(Double valor) {
        return this;
    }

    @Override
    public Builder setEscala(Integer valor) {
        return this;
    }

    @Override
    public Builder setEqn(Integer valor) {
        return this;
    }

    @Override
    public Builder setLargada(PontoGeografico pontoGeografico) {
        return this;
    }

    @Override
    public Builder setPartida(PontoGeografico pontoGeografico) {
        return this;
    }

    @Override
    public Builder setPrismas(List<Prisma> prismas) {
        return this;
    }

    @Override
    public Builder setChegada(PontoGeografico pontoGeografico) {
        return this;
    }

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
