package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// CodeChef - ATM Problem
public class OptimizedATM {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String var[] = reader.readLine().split(" ");
		
		int amountWithdrawl = Integer.parseInt(var[0]);
		float totalBalance = Float.parseFloat(var[1]);
		
		if (amountWithdrawl % 5 == 0 && totalBalance > (amountWithdrawl + 0.50)) {
			System.out.format("%.2f", totalBalance - (amountWithdrawl + 0.50));
		}
		else {
			System.out.format("%.2f", totalBalance);
		}
	}
}
