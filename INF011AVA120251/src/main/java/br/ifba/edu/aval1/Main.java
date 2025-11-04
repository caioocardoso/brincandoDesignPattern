package br.ifba.edu.aval1;

import br.ifba.edu.aval1.builder.Builder;
import br.ifba.edu.aval1.builder.ListaPassagensBuilder;
import br.ifba.edu.aval1.builder.MapaBuilder;
import br.ifba.edu.aval1.builder.SinaleticaBuilder;
import br.ifba.edu.aval1.director.percursoDirector;
import br.ifba.edu.aval1.model.*;
import br.ifba.edu.aval1.prototype.BoletimProvaManager;

import java.time.Duration;

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
        ListaPassagensBuilder builder = new ListaPassagensBuilder();
        percursoDirector director = new percursoDirector(builder);
        director.createPercurso();
        builder.build();

        BoletimProvaManager boletimProvaManager = BoletimProvaManager.getInstance();

        BoletimProva atleta1 = boletimProvaManager.criarBoletim("12000", Sexo.D, Idade.INFANTIL, Dificuldade.N);
        BoletimProva atleta2 = boletimProvaManager.criarBoletim("13000", Sexo.D, Idade.INFANTIL, Dificuldade.N);

        atleta1.registrar(31, Duration.ofSeconds(60));
        atleta1.registrar(32, Duration.ofSeconds(80));
        atleta1.registrar(33, Duration.ofSeconds(100));
        atleta1.registrar(34, Duration.ofSeconds(150));

        atleta2.registrar(31, Duration.ofSeconds(55));
        atleta2.registrar(32, Duration.ofSeconds(95));
        atleta2.registrar(33, Duration.ofSeconds(125));
        atleta2.registrar(34, Duration.ofSeconds(160));

        System.out.println(atleta1);
        System.out.println(atleta2);

    }
}