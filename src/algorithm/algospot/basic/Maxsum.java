package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maxsum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			// CALCULATE
			int N = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0;
			int max=0;
			for(int i=0; i<N; i++){
				int temp = Integer.parseInt(st.nextToken());
				sum += temp;
				if(sum<0){
					sum = 0;
				}
				if(sum>max)
					max = sum;
			}
			// OUTPUT
			System.out.println(max);
		}
	}
}
