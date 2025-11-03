package br.ifba.edu.aval1.builder;

import br.ifba.edu.aval1.model.*;

import java.util.List;

public interface Builder {
    public Builder setSexo(Sexo sexo);
    public Builder setIdade(Idade idade);
    public Builder setDificuldade(Dificuldade dificuldade);
    public Builder setDistancia(Double valor);
    public Builder setDesnivel(Double valor);
    public Builder setEscala(Integer valor);
    public Builder setEqn(Integer valor);
    public Builder setLargada(PontoGeografico pontoGeografico);
    public Builder setPartida(PontoGeografico pontoGeografico);
    public Builder setPrismas(List<Prisma> prismas);
    public Builder setChegada(PontoGeografico pontoGeografico);
    public Builder setListaPassagens(List<TempoPassagem> tempos);
}
