package br.ifba.edu.aval1.builder;

import br.ifba.edu.aval1.model.*;

import java.util.List;

public abstract class Builder {
    public Builder setSexo(Sexo sexo){
        return this;
    };
    public Builder setIdade(Idade idade){
        return this;
    };
    public Builder setDificuldade(Dificuldade dificuldade){
        return this;
    };
    public Builder setDistancia(Double valor){
        return this;
    };
    public Builder setDesnivel(Double valor){
        return this;
    };
    public Builder setEscala(Integer valor){
        return this;
    };
    public Builder setEqn(Integer valor){
        return this;
    };
    public Builder setLargada(PontoGeografico pontoGeografico){
        return this;
    };
    public Builder setPartida(PontoGeografico pontoGeografico){
        return this;
    };
    public Builder setPrismas(List<Prisma> prismas){
        return this;
    };
    public Builder setChegada(PontoGeografico pontoGeografico){
        return this;
    };
    public Builder setListaPassagens(List<TempoPassagem> tempos){
        return this;
    };
}
