package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Meeting_Complete {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			int N = Integer.parseInt(br.readLine());
			int[] man = new int[N];
			int[] woman = new int[N];
			StringTokenizer st;
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++){
				man[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(man);
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++){
				woman[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(woman);
			// CALCULATE
			int sum = 0;
			for(int i=0; i<N; i++){
				sum += Math.abs(man[i]-woman[i]);
			}
			// OUTPUT
			System.out.println(sum);
		}
	}
}
