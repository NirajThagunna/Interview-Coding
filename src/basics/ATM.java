package basics;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

/*
 * @Author: Niraj Thagunna
 * @CodeChef
 * Pooja would like to withdraw X $US from an ATM. 
 * The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash 
 * to perform the withdrawal transaction (including bank charges). 
 * For each successful withdrawal the bank charges 0.50 $US. 
 * Calculate Pooja's account balance after an attempted transaction.
 * 
 * Input :
 * Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
 * Nonnegative number 0 <= Y <= 2000 with two digits of precision - Pooja's initial account balance.
 * 
 * Output :
 * Output the account balance after the attempted transaction, given as a number with two digits of precision. 
 * If there is not enough money in the account to complete the transaction, output the current bank balance.
 */

public class ATM {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);

			System.out.print("Enter the total balance : ");
			float totalBalance = scan.nextFloat();

			System.out.print("Enter the withdrawl amount : ");
			int amountWithdraw = scan.nextInt();

			float bankCharge = 0.50f;

			if (amountWithdraw < totalBalance) {
				if (amountWithdraw % 5 == 0) {
					float remainingBalance = totalBalance - (amountWithdraw + bankCharge);
					System.out.format("%.2f", remainingBalance);
				}
				else {
					System.out.format("%.2f", totalBalance);
				}
			}
			else {
				System.out.format("%.2f", totalBalance);
			}

			scan.close();

		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}
