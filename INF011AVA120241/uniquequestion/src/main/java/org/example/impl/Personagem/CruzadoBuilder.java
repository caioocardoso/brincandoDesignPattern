package org.example.Builder;

import org.example.impl.Personagem.Cruzado;
import org.example.interfaces.Arma;
import org.example.interfaces.Personagem;

import java.util.List;

public class PersonagemBuilder {
    private Cruzado personagembuilding = new Cruzado();

    private PersonagemBuilder() {}

    public static PersonagemBuilder builder() {
        return new PersonagemBuilder();
    }

    public PersonagemBuilder setAtaqueRapido(Double ataqueRapido) {
        this.personagembuilding.setAtaqueRapido(ataqueRapido);
        return this;
    }

    public PersonagemBuilder setAtaqueForca(Double ataqueForca) {
        this.personagembuilding.setAtaqueForca(ataqueForca);
        return this;
    }

    public PersonagemBuilder setAtaqueEspecial(Double ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
        return this;
    }

    public PersonagemBuilder setDefesa(Double defesa) {
        this.defesa = defesa;
        return this;
    }

    public PersonagemBuilder setMoedas(int moedas) {
        this.moedas = moedas;
        return this;
    }

    public PersonagemBuilder setHabilidade(boolean habilidade) {
        this.habilidade = habilidade;
        return this;
    }

    public PersonagemBuilder setArmas(List<Arma> armas) {
        this.armas = armas;
        return this;
    }

    public Personagem build(String tipo){
        if(tipo == "Cruzado"){

        }

    }
}
