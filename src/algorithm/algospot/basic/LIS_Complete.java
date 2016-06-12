package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class LIS_Complete {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // C<=50
		
		for(int testcase=0; testcase<C; testcase++){
			// INPUT
			int N = Integer.parseInt(br.readLine()); // N<=500
			int[] arr = new int[N+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=1; i<=N; i++){
				arr[i] = Integer.parseInt(st.nextToken());
			}
			// CALCULATE
			int[][] count = new int[N+1][N+1];
			int max = 1;
			for(int i=0; i<=N; i++){
				for(int j=0; j<=N; j++){
					if(i==0 || j==0){
						count[i][j] = 1;
					}else if(arr[i]<arr[j]){
						if(count[i][i]+1>count[i-1][j]){
							count[i][j] = count[i][i]+1;
							if(max<count[i][j])
								max = count[i][j];
						}else{
							count[i][j] = count[i-1][j];
						}
					}else{
						count[i][j] = count[i-1][j];
					}
				}
			}
			// OUTPUT
			System.out.println(max);
		}
	}
}
