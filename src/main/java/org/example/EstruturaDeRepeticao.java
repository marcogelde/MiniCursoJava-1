package org.example;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        listaDePalavras();
        forClassico();
        forPuro();
        inverteString();
    }

    private static void listaDePalavras() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        // Usando for-each para imprimir cada palavra
        for (String palavra : palavraList) {
            System.out.println(palavra);
        }

        // Usando forEach com referência de método para imprimir
        palavraList.forEach(System.out::println);
    }

    private static void forClassico() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        for (int i = 0; i < palavraList.size(); i++) {
            System.out.println(palavraList.get(i));
        }
    }

    private static void forPuro() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void inverteString() {
        String normal = "abcde";
        String invertida = "";

        for (int posicao = normal.length() - 1; posicao >= 0; posicao--) {
            invertida = invertida + normal.charAt(posicao);
        }
        System.out.println(invertida);
    }

}
