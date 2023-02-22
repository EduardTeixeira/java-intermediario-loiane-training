package aula55;

import aula53.DiaSemana;

public class TesteEnum2 {

    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class, "TERCA"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "TERCA");

        System.out.println(dia);

    }

}
