package aula63;

public class ExemploPrintf {

    public static void main(String[] args) {

        System.out.printf("Hello %s", "Olá, Mundo!");
        System.out.println();
        System.out.printf("Hello %S", "Olá, Mundo!");
        System.out.println();

        System.out.printf("%c", 'c');
        System.out.println();
        System.out.printf("%C", 'c');

        System.out.printf("%n");

        System.out.println("Valor Positivo");
        int valor = 123456789;
        System.out.printf("%d", valor);
        System.out.println();
        System.out.printf("%+d", valor);
        System.out.println();
        System.out.printf("%015d", valor);
        System.out.println();
        System.out.printf("%,d", valor);
        System.out.println();

        System.out.println("Valor Negativo");
        int valor2 = -123456789;
        System.out.printf("% d", valor2);
        System.out.println();

        double pontoFlutuante = 3.141567893;
        System.out.printf("%f", pontoFlutuante);
        System.out.println();
        System.out.printf("%.3f", pontoFlutuante);
        System.out.println();
        System.out.printf("%.2f", pontoFlutuante);
        System.out.println();
        System.out.printf("R$%10.2f", pontoFlutuante);
        System.out.println();

        String olaMundo = "Olá, Mundo!";
        System.out.printf("%20s", olaMundo);
        System.out.println();
        System.out.printf("%-20s", olaMundo);
        System.out.println();

        testeCompleto();
    }

    private static void testeCompleto() {

        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        System.out.println("\nNota Fiscal...");

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: Total de R$%,10.2f%n", "Item", i + 1, precos[i]);
        }

        // Java.util.Formater

    }

}
