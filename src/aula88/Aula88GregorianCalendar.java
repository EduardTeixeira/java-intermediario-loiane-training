package aula88;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {

		Calendar hoje1 = Calendar.getInstance();

		GregorianCalendar hoje = new GregorianCalendar();

		imprimirData(hoje);

		System.out.println(hoje.isLeapYear(2020));
		System.out.println(hoje.isLeapYear(2021));
		System.out.println(hoje.isLeapYear(2022));
		System.out.println(hoje.isLeapYear(2023));
		System.out.println(hoje.isLeapYear(2024));
		
		GregorianCalendar hoje2 = new GregorianCalendar(1996, 4, 27);
		
		imprimirData(hoje2);
		
		GregorianCalendar hoje3 = new GregorianCalendar(1996, 4, 27, 14, 30, 20);
		
		imprimirData(hoje3);
	}

	private static void imprimirData(Calendar hoje) {

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		mes++;
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);

		System.out.println(dia + "/" + mes + "/" + ano + " " + hora + ":" + minutos + ":" + segundos);

		System.out.printf("Hoje é: %d/%02d/%d %02d:%02d:%02d", dia, mes, ano, hora, minutos, segundos);

		System.out.println();

		System.out.println(hoje);

		hoje.add(Calendar.DAY_OF_MONTH, 5);

		System.out.printf("Hoje é: %d/%02d", hoje.get(Calendar.DAY_OF_MONTH), (hoje.get(Calendar.MONTH) + 1));

		System.out.println();
	}

}
