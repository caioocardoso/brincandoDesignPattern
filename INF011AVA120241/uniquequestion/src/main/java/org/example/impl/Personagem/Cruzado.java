package org.example.impl;

import org.example.interfaces.Arma;
import org.example.interfaces.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Cruzado implements Personagem {
    private Double ataqueRapido = 10.0;
    private Double ataqueForca = 50.0;
    private Double ataqueEspecial = 100.0;
    private Double defesa = 150.0;
    private int moedas = 100;
    private boolean habilidade = false;
    private List<Arma> armas = new ArrayList<>();

    @Override
    public Double getAtaqueRapido() {
        return this.ataqueRapido;
    }

    @Override
    public Double getAtaqueForca() {
        return this.ataqueForca;
    }

    @Override
    public Double getAtaqueEspecial() {
        return this.ataqueEspecial;
    }

    @Override
    public Double getDefesa() {
        return this.defesa;
    }

    public int getMoedas() {
        return this.moedas;
    }

    public boolean isHabilidade() {
        return this.habilidade;
    }

    public List<Arma> getArmas() {
        return this.armas;
    }
}
