package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
        numeroPar();
        stringIgual();
        stringInicia();
        datas();
    }

    private static void numeroPar() {
        Integer numero = 3;

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

    private static void stringIgual() {
        String frase = "Hoje é sabado";

        if (frase.contains("segunda feira")) {
            if (frase.contains("seis da tarde")) {
                System.out.println("hora de alegria");
            } else {
                System.out.println("dia de tristeza");
            }
        } else if (frase.contains("sexta feira") || frase.contains("sabado") || frase.contains("domingo")) {
            System.out.println("dia de alegria");
        } else {
            System.out.println("dia normal");
        }
    }
    private static void stringInicia() {
        String palavra = "alegria";

        if(palavra.startsWith("a")) {
            System.out.println("palavra iniciada em a");
        }else
            System.out.println("palavra iniciada em outra letra");
    }
    private static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2025");

        if(data.before(new Date())) {
            System.out.println("esse dia já passou");
        }else
            System.out.println("esse dia está por vir");
    }
}
