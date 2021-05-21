package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * @Author: Niraj Thagunna
 * 
 * Add Two Numbers
 */

public class AddTwoNumbers {

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
		
		// FastReader class object
		FastReader fastReader = new FastReader();
		// read the how many lines of the input you want to take
		int t = fastReader.nextInt();
		
		ArrayList<Integer> output = new ArrayList<>();
		
		while (t-- > 0) {
			int a = fastReader.nextInt();
			int b = fastReader.nextInt();
			
			int sum = a + b;
			output.add(sum);
		}
		
		for (Integer item : output) {
			System.out.println(item);
		}
	}
}








