package algorithm.brain.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DiamondPath {
	static int[][] arr;
	static int N;
	static int height;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine()); // 1<=C<=100
		
		for(int testcase=0; testcase<C; testcase++){
			// INPUT
			N = Integer.parseInt(br.readLine()); // 1<=N<=100
			height = 2*N-1;
			arr = new int[height][N];
			for(int i=0; i<height; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				int j = 0;
				while(st.hasMoreTokens()){
					arr[i][j] = Integer.parseInt(st.nextToken());
					j++;
				}
			}
			// CALCULATE
			int[][] sum = new int[height][N];
			FindPath(sum);
			// OUTPUT
			System.out.println(sum[height-1][0]);
		}
	}
	
	public static void FindPath(int[][] sum){
		for(int i=0; i<height; i++){
			for(int j=0; j<N ; j++){
				if(arr[i][j] == 0) break;
				int temp1=arr[i][j], temp2=arr[i][j];
				if(i<N){
					if(i-1>=0 && j-1>=0) temp1 = arr[i][j]+sum[i-1][j-1];
					if(i-1>=0) temp2 = arr[i][j]+sum[i-1][j];
				}else{
					if(i-1>=0) temp1 = arr[i][j]+sum[i-1][j];
					if(i-1>=0) temp2 = arr[i][j]+sum[i-1][j+1];
				}
				if(temp1>temp2) sum[i][j] = temp1;
				else sum[i][j]=temp2;
			}
		}
	}
}
