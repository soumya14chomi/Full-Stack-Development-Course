package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeAPITest1 {

	public static void main(String[] args) {
		localDateTimeAPI();	

	}
	
	public static void localDateTimeAPI() {
	// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatCurrent = current.format(format);
		
		System.out.println("Formatted:"+formatCurrent);
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds =current.getSecond();
		System.out.println(month+" "+day+" "+seconds);
		
		LocalDate date2 = LocalDate.of(1998, 6, 14);
		System.out.println("My Birthday:"+date2);
		
		LocalDateTime dtime = current.withDayOfMonth(3).withYear(2024);
		System.out.println("Date with Time"+dtime);
	}

}
