package aula71;

public class MinhaThreadSoma implements Runnable {

    private String nome;
    private int[] nums;
    private static Calculadora calculadora = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {

        System.out.println(this.nome + " - iniciada");

        int soma = calculadora.somaArray(this.nums);

        System.out.println("Resultado da soma - Thread: " + this.nome + " é " + soma);

        System.out.println(this.nome + " - finalizou");
    }

}
