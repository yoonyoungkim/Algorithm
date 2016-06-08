package algorithm.algospot.superbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mispelling {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=1; testcase<=T; testcase++){
			// INPUT
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());	// 1 ≤ N ≤ 1000
			String str = st.nextToken();
			// CALCULATE
			// N-1 번째 제외 하고 모두 가져옴
			String result = "";
			if(N>str.length())
				result = str;
			else
				result = str.substring(0, N-1)+str.substring(N);
			// OUTPUT
			System.out.println(testcase + " " + result);
		}
	}
}
