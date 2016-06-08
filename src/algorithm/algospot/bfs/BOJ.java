package algorithm.algospot.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ {
	static int M;
	static int N;
	static int[][] arr;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken()); // 1<=N<=100
		N = Integer.parseInt(st.nextToken()); // 1<=M<=100
		arr = new int[N][M];
		
		for(int i=0; i<N; i++){
			String temp = br.readLine();
			for(int j=0; j<M; j++){				
				arr[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
			}
		}
	
		DFS_SP(0, 0, 0);
		System.out.println(min);
	}
	// M =3, N=4
	public static void DFS_SP(int x, int y, int count){
		if(x==N-1 && y==M-1){
			if(min>count){
				min = count;
			}
			return;
		}
		
		if(arr[x][y]==1)
			count++;
		
		if(x+1<N){
			DFS_SP(x+1, y, count);
		}
		
		if(y+1<M){
			DFS_SP(x, y+1, count);
		}
			
		if(arr[x][y]==1)
			count--;
	}
}
