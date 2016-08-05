package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1003 {
	static int count0;
	static int count1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int testcase=0; testcase<T; testcase++){
			int N = Integer.parseInt(br.readLine());
			count0 = 0;
			count1 = 0;
			fibonacci(N);
			System.out.println(count0 + " " + count1);
		}
	}
	
	static int fibonacci(int n){
		if(n==0){
			count0++;
			return 0;
		}else if(n==1){
			count1++;
			return 1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

}
