package aula89;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z Z");

		Calendar data = Calendar.getInstance();

		System.out.println(data.getTime());

		System.out.println(sdf.format(data.getTime()));

		Date hoje = new Date();
		System.out.println(sdf.format(hoje));

		String d = sdf.format(hoje);
		System.out.println(d);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		String minhaData = "20/02/2000";

		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);
			System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
