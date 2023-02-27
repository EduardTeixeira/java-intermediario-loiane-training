package aula61;

public class TesteParametros {

    public static void main(String[] args) {

        Contato contato = new Contato("Contato 1", "1234-5678", "contato1@email.com");
        int valor = 10;

        System.out.println("Valor original...");
        System.out.println(contato);
        System.out.println(valor);

        System.out.println("\nExemplo 1...");
        testePassagemValorReferencia(valor, contato);
        System.out.println(contato);
        System.out.println(valor);

        System.out.println("\nExemplo 2...");
        testePassagemValorReferencia2(valor, contato);
        System.out.println(contato);
        System.out.println(valor);

    }

    private static void testePassagemValorReferencia(int valor, Contato contato) {

        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "2222-6666", "contato2@email.com");
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato) {

        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato " + novoValor);
    }

}
