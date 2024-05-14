package DateTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {
	
	public static void zonedTimeDate() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
		String formattedCurrentDate = date.format(format);
		
		System.out.println(formattedCurrentDate);
		
		ZonedDateTime currZone = ZonedDateTime.now();
		System.out.println("The current Zone:"+currZone.getZone());
		
		ZoneId tokya = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyoZone = currZone.withZoneSameInstant(tokya);
		
		System.out.println("Time now in Tokyo:"+tokyoZone);
		
		//DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yy HH:MM:ss");
		
		String formatted = tokyoZone.format(format);
		System.out.println("Formatted tokyo time:" +formatted);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zonedTimeDate();
	}

}
