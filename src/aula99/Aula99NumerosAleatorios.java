package aula99;

import java.util.Random;

public class Aula99NumerosAleatorios {

    public static void main(String[] args) {

        double randomNumber = Math.random();
        System.out.println(randomNumber);
        System.out.println(randomNumber * 100);
        System.out.println(Math.floor(randomNumber * 100));


        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(101));

    }

}
