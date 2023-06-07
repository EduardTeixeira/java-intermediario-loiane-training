package aula93;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DataJava8 {

    public static void main(String[] args) {

        System.out.println("\nUtilizando LocalDate");

        // LocalDate data dd mm yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2023, 5, 27));

        System.out.println(LocalDate.parse("2022-05-27"));

        System.out.println(agora.plusDays(30));

        System.out.println(agora.minus(1, ChronoUnit.MONTHS));

        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfYear());
        System.out.println(agora.isLeapYear());
        System.out.println(LocalDate.parse("2020-05-27").isLeapYear());

        // LocalTime
        System.out.println("\nUtilizando LocalTime");

        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        System.out.println(LocalTime.of(20, 18));
        System.out.println(LocalTime.parse("17:33"));

        System.out.println(hAgora.plusMinutes(60));
        System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));

        System.out.println(hAgora.getHour());
        System.out.println(hAgora.getNano());

        // data completa = data + hora
        System.out.println("\nUtilizando LocalDateTime");

        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        System.out.println(agoraCompleto.plusYears(20));
        System.out.println(LocalDateTime.of(2023, 5, 27, 20, 22, 13));
        System.out.println(LocalDateTime.parse("2023-05-27T23:22:13"));

        // ZoneId
        System.out.println("\nUtilizando ZoneId");

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();
        /*
        for (String f : fusos){
            System.out.println(f);
        }
        */

        ZoneId sp = ZoneId.of("America/New_York");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2023-05-27T23:22:13"), sp);
        System.out.println(zdt);

        System.out.println(ZonedDateTime.parse("2023-05-27T23:22:13-04:00[America/New_York]"));

        // ZoneOffset
        System.out.println("\nUtilizando ZoneOffset");

        ZoneOffset offset = ZoneOffset.of("+05:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetdt);

        // Date e Calendar
        System.out.println("\nUtilizando Date e Calendar");

        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(ldtDate);

        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
    }

}
