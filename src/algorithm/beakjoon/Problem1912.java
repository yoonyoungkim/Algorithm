package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1912 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// INPUT
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] number = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());	

		for(int i=0; i<n; i++){
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		// CALCULATE
		int sum = 0;
		int max = number[0];
		for(int i=0; i<n ;i++){
			sum = Math.max(sum, 0) + number[i];
			max = Math.max(sum, max);
		}

		// OUTPUT
		System.out.println(max);		
	}

}
