package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StrJoin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++){
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			// CALCULATE
			
			int sum = 0;
			Arrays.sort(arr);
			for(int i=0; i<N; i++){
				sum += (arr[0] + arr[1]);
				arr[0] = arr[0] + arr[1];
				arr[1] = Integer.MAX_VALUE;	
				Arrays.sort(arr);
				if(arr[1] == Integer.MAX_VALUE)
					break;
			}
			// OUTPUT
			System.out.println(sum);
		}
	}
}
