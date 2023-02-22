package aula56.labs;

public class Calculadora {

    public static void main(String[] args) {

        double x = 2.5;
        double y = 3.0;

        for (Operacao operacao : Operacao.values()) {
            System.out.print(x + " ");
            System.out.print(operacao.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(operacao.executarOperacao(x, y));
        }

    }

}
