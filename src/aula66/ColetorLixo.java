package aula66;

import aula61.Contato;

public class ColetorLixo {

    public static void main(String[] args) {

        Contato[] contatos = new Contato[1000000];

        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato(
                    "Contato " + i,
                    "1234-56789" + i,
                    "contato" + i + "gmail.com"
            );
            contatos[i] = contato;
        }

        System.out.println("Contatos Criados...");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization();

        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória...");

        obterMemoriaUsada();

    }

    public static void obterMemoriaUsada() {

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime(); // singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);

    }

}
