package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2042 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// INPUT
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		int N = Integer.parseInt(st.nextToken());	// 1<=N<=1,000,000
		int M = Integer.parseInt(st.nextToken());	// 1<=M<=10,000
		int K = Integer.parseInt(st.nextToken());	// 1<=k<=10,000
		
		// CALCULATE
		int[] sum = new int[N+1];
		int[] arr = new int[N+1];
		for(int i=1; i<=N; i++){
			arr[i] = Integer.parseInt(br.readLine());
			sum[i] = arr[i]+sum[i-1];
		}

		
		
		for(int i=0; i<M+K; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a==1){
				for(int j=b; j<=N; j++){
					sum[j] += c-arr[b];
				}
				arr[b] = c;
			}else if(a==2){
				long result;
				if(b-1<0)
					result = sum[c];
				else
					result = sum[c]-sum[b-1];
				// OUTPUT
				System.out.println(result);
			}
		}
	}
}
