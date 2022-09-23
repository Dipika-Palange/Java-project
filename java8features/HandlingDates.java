package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate currentDate=LocalDate.now();
		System.out.println("Current date : "+currentDate);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println("Current time : "+currentTime);
		
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println("Current date and time : "+currentDateTime);
		
		LocalDate anotherDate=LocalDate.parse("2014-11-25");
		System.out.println("another date using parse() : "+anotherDate);
		
		LocalDate anotherDate2=LocalDate.of(2010, 12, 30);
		System.out.println("Another date using of() : "+anotherDate2);
		
		LocalDate yesterday=currentDate.minusDays(1);
		System.out.println("Yesterday's date : "+yesterday);
		LocalDate tomorrow=currentDate.plusDays(1);
		System.out.println("Tomorrow date : "+tomorrow);
		
		System.out.println("is leap year? "+currentDate.isLeapYear());
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formatterDate=currentDateTime.format(formatter);
		System.out.println("Formatted date : "+formatterDate);
		
		Month month=currentDateTime.getMonth();
		int day=currentDateTime.getDayOfMonth();
		int year= currentDateTime.getYear();
		
		int hour=currentDateTime.getHour();
		int min=currentDateTime.getMinute();
		int ss=currentDateTime.getSecond();
		
		System.out.println("Date is :"+day+" "+month+" "+year+" "+hour+":"+min+":"+ss);
		
	 ZonedDateTime current= ZonedDateTime.now();
	 System.out.println("Zoned date and time : "+current);
	 
	 System.out.println("Current zone : "+current.getZone());
	 
	 ZoneId tokyo=ZoneId.of("Asia/Tokyo");
	 
	 ZonedDateTime tokyoZone=current.withZoneSameInstant(tokyo);
	 
	 System.out.println("Tokyo Zone: "+tokyoZone);
	}

}
