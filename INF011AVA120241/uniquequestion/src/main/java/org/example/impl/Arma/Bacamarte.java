package org.example.impl.Arma;

import org.example.interfaces.Arma;

public class Espada implements Arma {
    private Double danoAdicionalRapido = 15.0;
    private Double danoAdicionalForca = 20.0;
    private Double danoAdicionalEspecial = 30.0;
    private boolean habilitada = false;


    @Override
    public Double getAdicionalRapido() {
        return this.danoAdicionalRapido;
    }

    @Override
    public Double getAdicionalForca() {
        return this.danoAdicionalForca;
    }

    @Override
    public Double getAdicionalEspecial() {
        return this.danoAdicionalEspecial;
    }

    @Override
    public Boolean habilitada() {
        return this.habilitada;
    }
}
