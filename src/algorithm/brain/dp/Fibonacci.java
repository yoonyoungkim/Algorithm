package algorithm.brain.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
	static int[] mem;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		mem = new int[N+1];
		// 0  1  2  3  4  5  6   7   8,  9  10
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		long start1 = System.nanoTime();
		System.out.println(fibonacci_DQ(N));
		long end1 = System.nanoTime();
		long start2 = System.nanoTime();
		System.out.println(fibonacci_DP(N));
		long end2 = System.nanoTime();
		
		System.out.println(end1-start1);
		System.out.println(end2-start2);
	}
	
	/* Divide and conquer*/
	public static int fibonacci_DQ(int n){
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonacci_DQ(n-1)+fibonacci_DQ(n-2);
	}
	
	/* Dynamic Planning */
	public static int fibonacci_DP(int n){
		for(int i=0; i<=n;i++){
			if(i==0)
				mem[i] = 0;
			else if(i==1)
				mem[i] = 1;
			else
				mem[i] = mem[i-1] + mem[i-2];
		}
		
		return mem[n];
	}
}
