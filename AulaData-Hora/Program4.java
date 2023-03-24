package aplicacao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:23");
		Instant d06 = Instant.parse("2022-07820T01:30:26z");
		
		LocalDate pastWeekDate = d04.minusDays(7);
		LocalDate nextWeekDate = d04.plusDays(7);
		
		LocalDateTime pastWeeklocalDate = d05.minusDays(7);
		LocalDateTime nextWeekLocalDate = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeelDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeeklocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(nextWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, nextWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}

}
