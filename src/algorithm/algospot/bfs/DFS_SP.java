package algorithm.algospot.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DFS_SP {
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++){
			String temp = br.readLine();
			for(int j=0; j<n; j++){
				arr[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
			}
		}
		// Calculate
		DFS_SP(arr, 0, 0, 1);
		
		System.out.println(min);
	}

	public static void DFS_SP(int[][] arr, int x, int y, int l){
		if(x==arr.length-1 && y==arr.length-1){
			if(min>l)
				min = l;
		}
		arr[x][y] = 0;
		if(x-1>0 && arr[x-1][y]==1)
			DFS_SP(arr, x-1, y, l+1);
		if(x+1<arr.length && arr[x+1][y]==1)
			DFS_SP(arr, x+1, y, l+1);
		if(y-1>0 && arr[x][y-1]==1)
			DFS_SP(arr, x, y-1, l+1);
		if(y+1<arr.length && arr[x][y+1]==1)
			DFS_SP(arr, x, y+1, l+1);
		arr[x][y] = 1;
	}
}
