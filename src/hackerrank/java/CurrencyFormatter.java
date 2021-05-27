package hackerrank.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

// Java Currency Formatter
public class CurrencyFormatter {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		// NumberFormat is a base abstract class for number format.
		// NumberFormat provides the interface to format a number.
		
		// getCurrencyInstance(Locale.US) it formats a number into the Locale of US and returns a StrinBuffer Object
		// format() is used to format a number
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		
		// India doesn't have a specific Locale so construct a Locale - Custom
		// public Locale(String locale, String country)
		// Locale INDIA = new Locale("en", "IN");
		String india = NumberFormat.getCurrencyInstance().format(payment);
		
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		
		System.out.println(us);
		System.out.printf(india);
		System.out.println(china);
		System.out.println(france);
	}
}
