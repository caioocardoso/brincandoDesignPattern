package br.ifba.edu.aval1;

import br.ifba.edu.aval1.builder.Builder;
import br.ifba.edu.aval1.builder.ListaPassagensBuilder;
import br.ifba.edu.aval1.builder.MapaBuilder;
import br.ifba.edu.aval1.builder.SinaleticaBuilder;
import br.ifba.edu.aval1.director.percursoDirector;
import br.ifba.edu.aval1.model.ListaPassagens;
import br.ifba.edu.aval1.model.Mapa;
import br.ifba.edu.aval1.model.Sinaletica;

public class Main {
    public static void main(String[] args) {
        new Main().run1();
        new Main().run2();
    }

    public void run1(){
        System.out.println("----------------- Q1 -----------------");
        MapaBuilder mapaBuilder = new MapaBuilder();
        SinaleticaBuilder sinaleticaBuilder = new SinaleticaBuilder();
        ListaPassagensBuilder listaPassagensBuilder = new ListaPassagensBuilder();

        percursoDirector director = new percursoDirector(mapaBuilder);
        director.createPercurso();

        director = new percursoDirector(sinaleticaBuilder);
        director.createPercurso();

        director = new percursoDirector(listaPassagensBuilder);
        director.createPercurso();

        Mapa mapa = mapaBuilder.build();
        Sinaletica sinaletica = sinaleticaBuilder.build();
        ListaPassagens listaPassagens = listaPassagensBuilder.build();

        System.out.println(mapa);
        System.out.println(sinaletica);
        System.out.println(listaPassagens);
    }


    public void run2(){
        System.out.println("----------------- Q2 -----------------");

    }
}