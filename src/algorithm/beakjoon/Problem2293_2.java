package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2293_2 {
	static int[][] W;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// INPUT
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		W = new int[N][N];
		
		StringTokenizer st;
		for(int i=0; i<N ;i++){
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++){
				W[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// CALCULATE
		int visited = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<N; i++){
			int result = TSP(i, i, visited);
			if(min>result)
				min = result;
		}
		
		// OUTPUT
		System.out.println(min);
	}
	
	public static int TSP(int startIndex, int curIndex, int visited){
		// index에 방문함을 표시
		visited += Math.pow(2, curIndex);
				
		// 모두 방문했으면, 시작점으로 돌아감
		if(Integer.bitCount(visited) == N){
			return W[curIndex][startIndex];
		}
		
		int result = Integer.MAX_VALUE;
		for(int i=0; i<N; i++){
			// 방문했으면 continue
			if(curIndex==i || ((int)Math.pow(2, i)&visited) !=0){
				continue;
			}
			
			// 방문안했을 경우
			else{
				int pathLength = W[curIndex][i] + TSP(startIndex, i, visited);
				if(pathLength<result){
					result = pathLength;
				}	
			}
		}
		
		return result;
	}
}
