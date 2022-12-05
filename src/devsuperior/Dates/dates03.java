package devsuperior.Dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class dates03 {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-11-09");
        LocalDateTime d05 = LocalDateTime.parse("2022-11-09T01:30:26");
        Instant d06 = Instant.parse("2022-11-09T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate(Data - 7 dias = )" + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate(Data + 7 dias = )" + nextWeekLocalDate);
        System.out.println();

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTIme = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime(Data/Time - 7 dias = )" + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTIme(Data/Time + 7 dias = )" + nextWeekLocalDateTIme);
        System.out.println();

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant(Instant - 7 dias = )" + pastWeekInstant);
        System.out.println("nextWeekInstant(Instant + 7 dias = )" + nextWeekInstant);
    }
}
