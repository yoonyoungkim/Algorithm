package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2293 {
	static int N;
	static int[][] W;
	static int[] visited;
	static int result = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// INPUT
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		W = new int[N][N];
		
		StringTokenizer st;
		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++){
				W[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// CALCULATE
		for(int i=0; i<N; i++){
			visited = new int[N];
			visited[i] = 1;
			backtracking(i, i, 0);
		}
		
		
		// OUTPUT
		System.out.println(result);
	}
	
	public static void backtracking(int startIndex, int index, int sum){
		for(int i=0; i<N; i++){
			if(index!=i && visited[i]==0){
				visited[i]=1;
				sum += W[index][i];
				
				boolean isVisitedAll = true;
				for(int j=0; j<N ;j++){
					if(visited[j]==0){
						isVisitedAll = false;
						break;
					}
				}
				if(isVisitedAll){
					sum += W[i][startIndex];
					if(result>sum)
						result = sum;
				}
					
				backtracking(startIndex, i, sum);
				sum -= W[index][i];
				visited[i]=0;
			}
		}
	}
}
