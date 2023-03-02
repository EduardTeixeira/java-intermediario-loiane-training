package aula71;

public class Teste {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        MinhaThreadSoma thread1 = new MinhaThreadSoma("#1", array);

        MinhaThreadSoma thread2 = new MinhaThreadSoma("#2", array);
    }

}
