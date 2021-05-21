package fastIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @Author: Niraj Thagunna
 * 
 * Fast Reading Input and Output
 * Using BufferedReader and StringTokenizer classes
 */
public class Main {
	
	// Fast Reader Class
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
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) {
		
		// FastReader object
		FastReader fastReader = new FastReader();
		// n is how many input numbers you want to enter
		int n = fastReader.nextInt();
		// k is the number with which you can divide the number
		int k = fastReader.nextInt();
		// to count how many numbers are divisible
		int count = 0;
		
		while (n-- > 0) {
			// number to be divided
			int x = fastReader.nextInt();
			
			if (x % k == 0)
				count++;
		}
		System.out.println(count);
	}
}








