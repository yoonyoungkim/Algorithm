package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Lunchbox {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			int N = Integer.parseInt(br.readLine());
			int[] M = new int[N];
			int[] E = new int[N];
			StringTokenizer st;
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++){
				M[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++){
				E[i] = Integer.parseInt(st.nextToken());
			}
			// CALCULATE
			// 먹는데 오래걸리는 순으로 배열
			int[] order = new int[N];
			for(int i=N-1; i>=1; i--){
				for(int j=i-1; j>=0; j--){
					if(E[i]>E[j]){
						int temp = E[i];
						E[i] = E[j];
						E[j] = temp;
						order[i] = j;
						
						int temp2 = M[i];
						M[i] = M[j];
						M[j] = temp2;
					}
				}
				
			}
			
			int sumM = 0;
			int sumE = 0;
			for(int i=0; i<N; i++){
				sumM += M[i];	
				sumE += E[i];
			}
			
			int sum = 0;
			
			// OUTPUT
			System.out.println(sum);
		}
	}
}
