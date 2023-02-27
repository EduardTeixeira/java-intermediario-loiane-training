package aula62;

public class ExemploVarargs {

    public static void main(String[] args) {

        System.out.println(soma(5, 3));

        System.out.println(soma(5, 3, 5));

        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(soma(vetor));

        // Exemplo Varargs - a partir do Java 5
        System.out.println(soma(1, 2, 3, 4, 5, 10));

    }

    static int soma(int a, int b) {
        return a + b;
    }

    static int soma(int a, int b, int c) {
        return a + b + c;
    }

    static int soma(int[] vetor) {

        int total = 0;

        for (int j : vetor) {
            total += j;
        }

        return total;
    }

    static int soma(int a, int b, Integer... vetor) {

        int total = 0;

        for (int j : vetor) {
            total += j;
        }

        return total;
    }

}
