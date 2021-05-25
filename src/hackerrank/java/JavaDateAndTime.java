package hackerrank.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class JavaDateAndTime {
	
	// method to find the day of some date
	public static String findDay(int month, int day, int year) {
		
		// Integer.valueOf(int a) method is an inbuilt method which is used to return an Integer instance representing the 
		// value of a
		int m = Integer.valueOf(month);
		int d = Integer.valueOf(day);
		int y = Integer.valueOf(year);
		
		// LocalDateTime - LocalDate and LocalTime
		LocalDate localDate = LocalDate.of(y, m, d);
		
		return localDate.getDayOfWeek().toString();
	}
	
	// main
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String[] date = reader.readLine().split(" ");
			
			int month = Integer.parseInt(date[0]);
			int day = Integer.parseInt(date[1]);
			int year = Integer.parseInt(date[2]);
			
			String dayOfDate = findDay(month, day, year);
			
			System.out.println(dayOfDate);
			
			reader.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
