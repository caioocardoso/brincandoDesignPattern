package org.example.impl.Personagem;

import org.example.interfaces.Arma;

import java.util.List;

public class SoldadoGuerraGolfoBuilder {
    private SoldadoGuerraGolfo personagembuilding = new SoldadoGuerraGolfo();

    private SoldadoGuerraGolfoBuilder() {}

    public static SoldadoGuerraGolfoBuilder builder() {
        return new SoldadoGuerraGolfoBuilder();
    }

    public SoldadoGuerraGolfoBuilder setAtaqueRapido(Double ataqueRapido) {
        this.personagembuilding.setAtaqueRapido(ataqueRapido);
        return this;
    }

    public SoldadoGuerraGolfoBuilder setAtaqueForca(Double ataqueForca) {
        this.personagembuilding.setAtaqueForca(ataqueForca);
        return this;
    }

    public SoldadoGuerraGolfoBuilder setAtaqueEspecial(Double ataqueEspecial) {
        this.personagembuilding.setAtaqueEspecial(ataqueEspecial);
        return this;
    }

    public SoldadoGuerraGolfoBuilder setDefesa(Double defesa) {
        this.personagembuilding.setDefesa(defesa);
        return this;
    }

    public SoldadoGuerraGolfoBuilder setMoedas(int moedas) {
        this.personagembuilding.setMoedas(moedas);
        return this;
    }

    public SoldadoGuerraGolfoBuilder setHabilidade(boolean habilidade) {
        this.personagembuilding.setHabilidade(habilidade);
        return this;
    }

    public SoldadoGuerraGolfoBuilder setArmas(List<Arma> armas) {
        this.personagembuilding.setArmas(armas);
        return this;
    }

    public SoldadoGuerraGolfo build(){
        return this.personagembuilding;
    }
}
