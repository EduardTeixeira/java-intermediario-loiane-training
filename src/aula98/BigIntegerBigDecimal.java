package aula98;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {

    public static void main(String[] args) {

        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c);

        float fa = 0.03f;
        float fb = 0.04f;
        float r = fb - fa;
        System.out.println(r);

        BigDecimal valor1 = new BigDecimal("0.03");
        BigDecimal valor2 = new BigDecimal("0.04");
        BigDecimal resultado = valor2.subtract(valor1);
        System.out.println(resultado);

        BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.9876543210");
        System.out.println(bd1.add(bd2)); // soma
        System.out.println(bd1.multiply(bd2)); // multiplicação
        System.out.println(bd1.divide(new BigDecimal(2))); // dividir

        BigInteger bi = new BigInteger("12345678901234567890");
        System.out.println(bi);
    }

}
