package br.ifba.edu.aval1.builder;

import br.ifba.edu.aval1.model.*;

import java.util.List;

public class MapaBuilder implements Builder {
    Sexo sexo;
    Idade idade;
    Dificuldade dificuldade;
    Integer escala;
    Integer eqn;
    PontoGeografico largada;
    PontoGeografico partida;
    List<Prisma> prismas;
    PontoGeografico chegada;

    @Override
    public Builder setSexo(Sexo sexo) {
        this.sexo = sexo;
        return this;
    }

    @Override
    public Builder setIdade(Idade idade) {
        this.idade = idade;
        return this;
    }

    @Override
    public Builder setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
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
        this.escala = valor;
        return this;
    }

    @Override
    public Builder setEqn(Integer valor) {
        this.eqn = valor;
        return this;
    }

    @Override
    public Builder setLargada(PontoGeografico pontoGeografico) {
        this.largada = pontoGeografico;
        return this;
    }

    @Override
    public Builder setPartida(PontoGeografico pontoGeografico) {
        this.partida = pontoGeografico;
        return this;
    }

    @Override
    public Builder setPrismas(List<Prisma> prismas) {
        this.prismas = prismas;
        return this;
    }

    @Override
    public Builder setChegada(PontoGeografico pontoGeografico) {
        this.chegada = pontoGeografico;
        return this;
    }

    @Override
    public Builder setListaPassagens(List<TempoPassagem> tempos) {
        return this;
    }

    public void init() {
        sexo = null;
        idade = null;
        dificuldade = null;
        escala = null;
        eqn = null;
        largada = null;
        partida = null;
        prismas = null;
        chegada = null;
    }

    public Mapa build() {
        Mapa mapa = new Mapa(sexo, idade, dificuldade, escala, eqn, largada, partida, prismas, chegada);
        init();
        return mapa;
    }
}
