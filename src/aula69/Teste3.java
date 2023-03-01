package aula69;

public class Teste3 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 700);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 1200);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        /*
        try {
            t1.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */

        t2.start();
/*
        try {
            t2.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
 */

        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nPrograma finalizado...");
    }

}
