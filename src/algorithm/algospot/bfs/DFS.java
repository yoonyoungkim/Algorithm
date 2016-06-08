package algorithm.algospot.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DFS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int edgeNumber = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		int[][] map = new int[edgeNumber+1][edgeNumber+1];
		int[] visit = new int[edgeNumber+1];
		st = new StringTokenizer(br.readLine());
		
		while(true){
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			if(v1==-1&&v2==-1)
				break;
			map[v1][v2] = map[v2][v1] = 1;
		}
		DFS(start, map, visit);
	}
	
	public static void DFS(int n, int[][] map, int[] visit){
		visit[n] = 1;
		for(int i=1; i<visit.length; i++){
			if(map[n][i]==1 && visit[i]!=1){
				System.out.println(n+"에서 " + i + "로 이동");
				DFS(i, map, visit);
			}	
		}
	}
}
