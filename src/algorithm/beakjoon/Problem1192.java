package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1192 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// 1<=N<=1000
		int M = Integer.parseInt(br.readLine());	// 1<=M<=100,000
		int[][] map = new int[N][N];
		
		StringTokenizer st;
		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			map[x][y] = s;
			map[y][x] = s;
		}
	}

}
