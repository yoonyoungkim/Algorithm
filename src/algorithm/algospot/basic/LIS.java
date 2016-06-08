package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LIS {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // C<=50
		
		for(int testcase=0; testcase<C; testcase++){
			// INPUT
			int N = Integer.parseInt(br.readLine()); // N<=500
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++){
				arr[i] = Integer.parseInt(st.nextToken());
			}
			// CALCULATE
			int[][] count = new int[N][N];
			for(int i=0; i<N ;i++){
				boolean isPlus = false;
				for(int j=i; j<N; j++){
					if(!isPlus){
						if(j-1<0 || j==N-1){
							count[i][j] = 1;
						}else{
							if(arr[j]>arr[j-1]){
								if(i-1>=0){
									if(count[i-1][j]>count[i][j-1]+1)
										count[i][j] = count[i-1][j];
									else{
										count[i][j] = count[i][j-1]+1;
										isPlus = true;
									}
								} else{
									count[i][j] = count[i][j-1]+1;
									isPlus = true;
								}
							}else{
								count[i][j] = count[i][j-1];
							}
						}
					}else{
						count[i][j] = count[i][j-1];
					}
					
				}
			}
			// OUTPUT
			System.out.println(Arrays.deepToString(count));
		}
	}
}
