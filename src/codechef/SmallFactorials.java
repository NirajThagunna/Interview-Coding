package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
 * @Author: Niraj Thagunna
 * 
 * Small Factorials
 */
public class SmallFactorials {

	// FastRedaer class
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}
	
	// main method
	public static void main(String[] args) {
		// FastReader object
		FastReader reader = new FastReader();
		
		// taking the input for the test cases
		int t = reader.nextInt();
		
		while (t-- > 0) {
			// Take a number whose factorial has to be calculate
			int n = reader.nextInt();
			
			// BigInteger to store biggest integer value
			BigInteger res = new BigInteger("1");
			for (int i = 2; i <= n; i++) {
				res = res.multiply(BigInteger.valueOf(i));
			}
			// print the result
			System.out.println(res);
		}
	}
}







