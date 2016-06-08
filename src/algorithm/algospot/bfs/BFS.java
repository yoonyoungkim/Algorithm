package algorithm.algospot.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
	static int[][] map;
	static int[] visit;
	static Queue<Integer> q;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(String.valueOf(st.nextToken()));
		int start = Integer.parseInt(String.valueOf(st.nextToken()));
		
		map = new int[n+1][n+1];
		visit = new int[n+1];
		st = new StringTokenizer(br.readLine());
		while(true){
			int s = Integer.parseInt(String.valueOf(st.nextToken()));
			int e = Integer.parseInt(String.valueOf(st.nextToken()));
			if(s==-1 && e==-1)
				break;
			map[s][e] = map[e][s] = 1;
		}
		q = new LinkedList<>();
		BFS(start);
	}
	
	public static void BFS(int n){
		visit[n] = 1;
		for(int i=1; i<map.length; i++){
			if(visit[i]==0 && map[n][i]==1 && !q.contains(i)){
				q.offer(i);
			}	
		}
		if(q.peek() == null)
			return;
		else{
			BFS(q.poll());
		}
			
	}

}
