package org.example;

import org.example.Singleton.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton instancia = Singleton.getInstance();
        Singleton instancia2 = Singleton.getInstance();

        System.out.println(instancia == instancia2);

    }
}