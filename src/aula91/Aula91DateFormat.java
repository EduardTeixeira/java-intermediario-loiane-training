package aula91;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println(Locale.getDefault());

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println("Hoje Formatado ::: " + hojeFormatado);

        Locale.setDefault(new Locale("pt", "Brazil"));
        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println("Hoje com Locale pt-br ::: " + hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado); // dd/MMM/yyyy

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        String data = "12-02-2023 14:25";
        try {
            Date dateDate = DateFormat.getInstance().parse(data);
            System.out.println(dateDate);

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dateDate);
            System.out.println(calendario);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
