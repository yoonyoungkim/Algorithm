package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1717 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// 1<=n<=1,000,000
		int m = Integer.parseInt(st.nextToken());	// 1<=m<=100,000
		
		int[] result = new int[n+1];
		
		for(int i=0; i<m; i++){
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(x==0){
				if(a>b){
					result[b]= a;
				}else{
					result[a] = b;
				}
					 
			}else if(x==1){
				if(result[a] == result[b])
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
