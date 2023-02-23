package aula57;

public class TesteWrapper {

    public static void main(String[] args) {

        // TIPOS PRIMITIVOS DO JAVA (NÃO SÃO OBJETOS)
        short pshort = 1;
        byte pbyte = 10;
        int pint = 100;
        long plong = 200L;
        float pfloat = 3.5f;
        double pdouble = 3.5555;
        boolean pboolean = true;
        char pchar = 'a';

        // TIPOS WRAPPERS (são objetos do Java)
        Short wShort = new Short((short) 1);
        Byte wByte = new Byte((byte) 10);
        Integer wInteger = new Integer(100);
        Long wLong = new Long(100L);
        Float wFloat = new Float(3.5f);
        Double wDouble = new Double(3.555);
        Boolean wBoolean = new Boolean(true);
        Character wChar = new Character('b');

        Integer wInteger1 = new Integer("150");
        System.out.println(wInteger1.byteValue());
        System.out.println(wInteger1.longValue());

        Double wDouble1 = new Double("3.5");
        System.out.println(wDouble1);
        System.out.println(wDouble1.doubleValue());
        System.out.println(wDouble1.floatValue());

        int pInt1 = Integer.parseInt("123456");
        System.out.println(pInt1);

        double pDouble1 = Double.parseDouble("3.567");
        System.out.println(pDouble1);

        Integer wInt1 = Integer.valueOf(150);
        System.out.println(wInt1);

        System.out.println(wInt1 == wInteger1);
        System.out.println(wInt1.equals(wInteger1));
    }

}
