package aula53;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Teste {

    public static void main(String[] args) {

        usandoConstantes();

        System.out.println();

        usandoEnum();
    }

    private static void usandoConstantes() {
        System.out.println("Teste utilizando Constantes no Java");
        imprimeDiaSemana(DiaSemanaConstantes.SEGUNDA);
        imprimeDiaSemana(DiaSemanaConstantes.TERCA);
        imprimeDiaSemana(DiaSemanaConstantes.QUARTA);
        imprimeDiaSemana(DiaSemanaConstantes.QUINTA);
        imprimeDiaSemana(DiaSemanaConstantes.SEXTA);
        imprimeDiaSemana(DiaSemanaConstantes.SABADO);
        imprimeDiaSemana(DiaSemanaConstantes.DOMINGO);
    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoEnum() {
        System.out.println("Teste usando Enum no Java...");
        imprimeDiaSemana(DiaSemana.SEGUNDA);
        imprimeDiaSemana(DiaSemana.TERCA);
        imprimeDiaSemana(DiaSemana.QUARTA);
        imprimeDiaSemana(DiaSemana.QUINTA);
        imprimeDiaSemana(DiaSemana.SEXTA);
        imprimeDiaSemana(DiaSemana.SABADO);
        imprimeDiaSemana(DiaSemana.DOMINGO);
    }

    private static void imprimeDiaSemana(DiaSemana diaSemana) {
        switch (diaSemana) {
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

}
