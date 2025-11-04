package br.ifba.edu.aval1.builder;

import br.ifba.edu.aval1.model.*;

import java.util.List;

public class SinaleticaBuilder extends Builder {
    Sexo sexo;
    Idade idade;
    Dificuldade dificuldade;
    Double distancia;
    Double desnivel;

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
        this.distancia = valor;
        return this;
    }

    @Override
    public Builder setDesnivel(Double valor) {
        this.desnivel = valor;
        return this;
    }

    private void limpar() {
        sexo = null;
        idade = null;
        dificuldade = null;
        distancia = null;
        desnivel = null;
    }

    public Sinaletica build() {
        Sinaletica sinaletica = new Sinaletica(sexo, idade, dificuldade, distancia, desnivel);
        limpar();
        return sinaletica;
    }
}
