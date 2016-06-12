package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			int N = Integer.parseInt(br.readLine());	//n (1 <= n <= 50)
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<arr.length; i++){
				arr[i] = Integer.parseInt(st.nextToken());
			}
			// CALCULATE
			int count = N;
			int a = 0;	// 현우
			int b = 0;	// 서하
			while(count>0){
				if(count>=2){
					
				}else{
					
				}
			}
			int result = a-b;
			
			// OUTPUT
			System.out.println(result);
		}
	}
}
