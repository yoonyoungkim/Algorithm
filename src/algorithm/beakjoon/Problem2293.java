package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2293 {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] value = new int[n+1];
		for(int i=1; i<=n; i++){
			value[i] = Integer.parseInt(br.readLine());
		}
		
		int[][] map = new int[k+1][n+1];
		for(int i=1; i<=k; i++){
			for(int j=1; j<=n; j++){
				if(i<value[j]){
					map[i][j] = map[i][j-1];
				}else{
					if(i==value[j]){
						map[i][j] = map[i][j-1]+1;
					}else{
						map[i][j] = map[i][j-1]+map[i-value[j]][j];
					}
				}
			}
		}
		
		System.out.print(map[k][n]);
	}
}
