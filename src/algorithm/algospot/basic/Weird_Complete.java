package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Weird_Complete {
	static int N;
	static ArrayList<Integer> list;
	static boolean isEnded = false;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			N = Integer.parseInt(br.readLine());
			int dividor = (int) Math.sqrt(N);
			isEnded = false;
			// CALCULATE
			list = new ArrayList<Integer>();
			for(int i=1; i<=dividor; i++){
				if(N%i==0){
					list.add(i);
					if(i != N/i && N/i!=N) list.add(N/i);
				}
			}
			int sum = 0; 
			for(int i=0; i<list.size(); i++){
				sum += list.get(i);
			}
			
			String result = "not weird";
			if(sum > N){
				for(int i=2; i<=list.size(); i++){
					int[] arr = new int[i];
					combination(arr, 0, 0, list.size(), i);
					
					if(isEnded){
						break;
					}
				}
				
				if (!isEnded) 
					result = "weird";
			}
			
			
			
			// OUTPUT
			System.out.println(result);
		}
	}	
	
	public static void combination(int[] arr, int index, int targetIndex, int n, int r){
		if(isEnded)
			return;
		
		if(r==0){
			int sum  = 0; 
			for(int i=0; i<arr.length; i++){
				sum += arr[i];
			}
			if(sum == N)
				isEnded = true;
		}else if(targetIndex == n){
			return;
		}else{
			arr[index] = list.get(targetIndex);
			combination(arr, index+1, targetIndex+1, n, r-1);
			combination(arr, index, targetIndex+1, n, r);
		}
	}
}
