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
			int count = 0;
			int length = arr.length;
			int a = 0;
			int b = 0;
			while(length!=0){
				// 현우.
				if(count%2==0){
				}
				// 서하.
				else{
				}
				length = arr.length;
				count++;
			}
			
			
			// OUTPUT
			int result = 0;
			System.out.println(result);
		}
	}
	
	public static void choose(int[] arr, int result){
		// arr[0] 
		// 1. arr[1] get
		// 3. arr[arr.length-1] get
		int myNum1 = arr[0];
		int yourNum1_1 = arr[1];
		int yourNum1_2 = arr[arr.length-1];
		int result1 = Math.max(Math.max(myNum1-yourNum1_1, myNum1), myNum1-yourNum1_2);
		
		
		// arr[0], arr[1]
		// 1. arr[2] get
		// 3. arr[arr.length-1] get
		int myNum2 = 0;
		int yourNum2_1 = arr[2];
		int yourNum2_2 = arr[arr.length-1];
		int result2 = Math.max(Math.max(myNum2-yourNum2_1, myNum2), myNum2-yourNum2_2);
		
		// arr[arr.length-1]
		// 1. arr[0] get
		// 3. arr[arr.length-2] get
		int myNum3 = arr[arr.length-1];
		int yourNum3_1 = arr[0];
		int yourNum3_2 = arr[arr.length-2];
		int result3 = Math.max(Math.max(myNum3-yourNum3_1, myNum3), myNum3-yourNum3_2);
		
		
		// arr[arr.length-2], arr[arr.length-1]
		// 1. arr[0] get
		// 3. arr[arr.length-3] get
		int myNum4 = 0;
		int yourNum4_1 = arr[0];
		int yourNum4_2 = arr[arr.length-3];
		int result4 = Math.max(Math.max(myNum4-yourNum4_1, myNum4), myNum4-yourNum4_2);
		
		if(result1-result2>0){
			
		}
	}
	
}
