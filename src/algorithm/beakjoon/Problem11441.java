package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11441 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		int[] sum = new int[N];
		for(int i=0; i<N; i++){
			A[i] = Integer.parseInt(st.nextToken());
			if(i==0)
				sum[i] = A[i];
			else
				sum[i] = sum[i-1] + A[i];
		}
		
		int M = Integer.parseInt(br.readLine());
		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken())-1;
			int end = Integer.parseInt(st.nextToken())-1;
			int result = 0;
			if(start-1<0)
				result = sum[end];
			else
				result = sum[end] - sum[start-1];
			
			System.out.println(result);
		}
	}

}
