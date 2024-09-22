package org.example;

import java.util.ArrayList;

public class RepeticaoEDecisaoJuntos {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeUmADez = new ArrayList<>();

        for (int posicao = 1; posicao <= 10; posicao++) {
            listaDeUmADez.add(posicao);
        }

        ArrayList<Integer> numeroPares = new ArrayList<>();
        ArrayList<Integer> numeroImpares = new ArrayList<>();

        for (Integer numero : listaDeUmADez) {
            if (numero % 2 == 0) {
                numeroPares.add(numero);
            } else {
                numeroImpares.add(numero);
            }
        }
        for (Integer numeroPar : numeroPares) {
            System.out.println(numeroPar);
        }
        for (Integer numeroImpar : numeroImpares) {
            System.out.println(numeroImpar);
        }
    }
}