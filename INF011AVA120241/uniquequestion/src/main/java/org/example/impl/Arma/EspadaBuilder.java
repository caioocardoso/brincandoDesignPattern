package org.example.impl.Arma;

public class BacamarteBuilder {
    Bacamarte armabuilding = new Bacamarte();

    private BacamarteBuilder(){};

    public static BacamarteBuilder builder (){
        return new BacamarteBuilder();
    }

    public BacamarteBuilder setDanoAdicionalRapido(Double danoAdicionalRapido) {
        armabuilding.setDanoAdicionalRapido(danoAdicionalRapido);
        return this;
    }

    public BacamarteBuilder setDanoAdicionalForca(Double danoAdicionalForca) {
        armabuilding.setDanoAdicionalForca(danoAdicionalForca);
        return this;
    }

    public BacamarteBuilder setDanoAdicionalEspecial (Double danoAdicionalEspecial) {
        armabuilding.setDanoAdicionalEspecial(danoAdicionalEspecial);
        return this;
    }

    public BacamarteBuilder setHabilitada(boolean habilitada) {
        armabuilding.setHabilitada(habilitada);
        return this;
    }

    public Bacamarte build(){
        return armabuilding;
    }
}
