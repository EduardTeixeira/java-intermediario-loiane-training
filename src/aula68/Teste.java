package aula68;

public class Teste {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 900);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 100);
    }

}
