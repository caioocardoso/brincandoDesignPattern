package br.ifba.edu.aval1.director;

import br.ifba.edu.aval1.builder.Builder;
import br.ifba.edu.aval1.model.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class percursoDirector {
    Builder builder;

    private percursoDirector(){}

    public percursoDirector(Builder builder){
        this.builder = builder;
    }

    public void createPercurso(){
        builder
                .setSexo(Sexo.D)
                .setIdade(Idade.VIP)
                .setDificuldade(Dificuldade.N)
                .setEqn(5)
                .setEscala(7500)
                .setPartida(new PontoGeografico(-12.99759, -38.47413, 0.0))
                .setChegada(new PontoGeografico(-12.99701, -38.47424, 0.0))
                .setListaPassagens(criarListaPassagens());
    }

    private static List<TempoPassagem> criarListaPassagens() {
        Prisma prisma31 = new Prisma(31, new PontoGeografico(-12.99747, -38.47435, 0.0));
        Prisma prisma32 = new Prisma(32, new PontoGeografico(-12.99825, -38.47526, 0.0));

        List<TempoPassagem> tempos = new ArrayList<>();

        tempos.add(new TempoPassagem(prisma31, Duration.ofSeconds(0)));
        tempos.add(new TempoPassagem(prisma32, Duration.ofSeconds(0)));

        Prisma chegada = new Prisma(999, new PontoGeografico(-12.99701, -38.47424, 0.0));
        tempos.add(new TempoPassagem(chegada, Duration.ofSeconds(0)));

        return tempos;
    }
}
