package aula74.labs;

public class Teste {

    public static void main(String[] args) {

        ThreadSemaforo semaforo = new ThreadSemaforo(CorSemaforo.VERMELHO);

        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.getCor());
            semaforo.esperaTrocaCor();
        }

        semaforo.pararSemaforo();

    }

}
