package algorithm.algospot.superbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bruteforce {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // 테스트 케이스의 수 C(<=100)

		for (int testcase = 0; testcase < C; testcase++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // (1 <= A <= B <= 100000000)
			int B = Integer.parseInt(st.nextToken()); // (1 <= A <= B <= 100000000)
			int N = Integer.parseInt(st.nextToken()); // (1 <= N <= 128)
			
			
			// CALCULATE
			long result = 0;
			for (int i = A; i <= B; i++) {
				long temp = 1;
				for (int j = 0; j < i; j++) {
					temp *= N;						
				}
				result += temp % 1000000007;
			}

			result = result % 1000000007;
			// OUTPUT
			System.out.println(result);
		}

	}

}
