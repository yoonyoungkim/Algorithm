package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
	static int N;
	static int[][] map;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			N = Integer.parseInt(br.readLine());
			// CALCULATE
			map = new int[N][N];
			// OUTPUT
			
		}
	}
	
	public static void checkMap(int index){
		
	}
	
	public static void exceptMap(int x, int y){
		for(int i=0; i<N; i++){
			map[x][i] = -1;
			map[i][y] = -1;
			int tempX = x+i;
			int tempY = y+i;
			if(tempX>=N){
				tempX -= N;
			}
			if(tempY>=N){
				tempY -= N;
			}
			map[tempX][tempY] = -1;
		}
	}
}
