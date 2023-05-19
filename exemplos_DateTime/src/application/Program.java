package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-04-30");
		LocalDateTime d05 = LocalDateTime.parse("2023-04-30T12:45:55");
		Instant d06 = Instant.parse("2023-04-30T12:45:55Z");
		Instant d07 = Instant.parse("2023-04-30T12:45:55-03:00");
		
		LocalDate d08 = LocalDate.parse("30/05/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("30/05/2023 13:00", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 6, 12);
		LocalDateTime d11 = LocalDateTime.of(2023, 6, 12, 21, 20);
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("d04 Formatado = " + d04.format(fmt1));
		System.out.println("d05 Formatado = " + d05.format(fmt2));
		System.out.println("d06 = " + fmt3.format(d06));


	}

}
