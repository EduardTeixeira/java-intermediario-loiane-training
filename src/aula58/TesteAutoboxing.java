package aula58;

public class TesteAutoboxing {

    public static void main(String[] args) {

        // Autoboxing
        Short wShort = 1;
        Byte wByte = 10;
        Integer wInteger = 100;
        Long wLong = 100L;
        Float wFloat = 3.5f;
        Double wDouble = 3.555;
        Boolean wBoolean = true;
        Character wChar = 'b';

        // Auto un-boxing
        int num = wInteger; // wInteger.intValue();

        wInteger++;
        System.out.println(wInteger);

        num++;
        System.out.println(num);

        Integer num1 = num / wInteger;
        System.out.println(num1);

        // mau uso
        Double a, b, c;
        a = 10.0;
        b = 12.2;
        c = 4.7;

        Double media = (a + b + c) / 3;

        System.out.println(media);

    }

}
