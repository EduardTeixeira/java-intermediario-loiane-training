package aula60;

public class TesteEscopo {

    public static void main(String[] args) {

        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(50);

        System.out.println(escopo.getValor());

        System.out.println(escopo.calculaValor(20));

        System.out.println(escopo.getValor());

        System.out.println(escopo.teste());

        System.out.println(escopo.getValor());

        escopo.outroTeste();

    }

}
