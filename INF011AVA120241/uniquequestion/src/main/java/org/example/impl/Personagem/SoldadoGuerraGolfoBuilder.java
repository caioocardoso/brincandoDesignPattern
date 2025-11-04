package org.example.impl.Personagem;

import org.example.interfaces.Arma;
import java.util.List;

public class CruzadoBuilder {
    private Cruzado personagembuilding = new Cruzado();

    private CruzadoBuilder() {}

    public static CruzadoBuilder builder() {
        return new CruzadoBuilder();
    }

    public CruzadoBuilder setAtaqueRapido(Double ataqueRapido) {
        this.personagembuilding.setAtaqueRapido(ataqueRapido);
        return this;
    }

    public CruzadoBuilder setAtaqueForca(Double ataqueForca) {
        this.personagembuilding.setAtaqueForca(ataqueForca);
        return this;
    }

    public CruzadoBuilder setAtaqueEspecial(Double ataqueEspecial) {
        this.personagembuilding.setAtaqueEspecial(ataqueEspecial);
        return this;
    }

    public CruzadoBuilder setDefesa(Double defesa) {
        this.personagembuilding.setDefesa(defesa);
        return this;
    }

    public CruzadoBuilder setMoedas(int moedas) {
        this.personagembuilding.setMoedas(moedas);
        return this;
    }

    public CruzadoBuilder setHabilidade(boolean habilidade) {
        this.personagembuilding.setHabilidade(habilidade);
        return this;
    }

    public CruzadoBuilder setArmas(List<Arma> armas) {
        this.personagembuilding.setArmas(armas);
        return this;
    }

    public Cruzado build(){
        return this.personagembuilding;
    }
}
