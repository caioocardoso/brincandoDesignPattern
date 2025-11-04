package br.ifba.edu.aval1.prototype;

import br.ifba.edu.aval1.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoletimProvaManager {
    private static BoletimProvaManager instance;

    private Map<String, ListaPassagens> listas;

    private BoletimProvaManager(){
        this.listas = new HashMap<String, ListaPassagens>();
    }

    public static BoletimProvaManager getInstance(){
        if(instance == null)
            instance = new BoletimProvaManager();
        return instance;
    }

    public String categoria (Sexo sexo, Idade idade, Dificuldade dificuldade){
        return sexo.toString() + idade.toString() + dificuldade.toString();
    }

    public BoletimProva criarBoletim(String numeroCBO, Sexo sexo, Idade idade, Dificuldade dificuldade){
        String categoria = categoria(sexo, idade, dificuldade);
        ListaPassagens passagens = listas.get(categoria);
        if(passagens == null){
            passagens = new ListaPassagens();
        }
        return new BoletimProva(numeroCBO, passagens.clone());
    }
}