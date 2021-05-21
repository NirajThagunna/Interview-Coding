package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @Author: Niraj Thagunna
 * 
 * Number Mirror
 */
public class NumberMirror {

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
		FastReader fastReader = new FastReader();
		// taking the input from user
		int n = fastReader.nextInt();
		
		// Output the same number
		System.out.println(n);
	}
}
