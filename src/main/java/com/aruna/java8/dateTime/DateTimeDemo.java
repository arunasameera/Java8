package com.aruna.java8.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		//Date time in java8 using devops branch
		
		LocalDate d = LocalDate.now();
		LocalDate birthday = LocalDate.of(1984, Month.AUGUST, 29);
		
		System.out.println(d);
		System.out.println(birthday);
		
		
		LocalTime t = LocalTime.now();
		LocalTime localTime = LocalTime.of(10, 25);
		
		System.out.println(t);
		System.out.println(localTime);
		

		LocalTime localTimeZOne = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(localTimeZOne);
		
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
	}

}
