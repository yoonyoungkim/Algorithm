package algorithm.algospot.shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Firetrucks {
	static int V;
	static int[][] path;
	static int[] visit;
	static int[] N;
	static int[] M;
	static int min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 1<=C<=50
		int C = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<C; testcase++){
			// INPUT
			StringTokenizer st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken()); // 장소의 수(2<=V<=1000)
			int E = Integer.parseInt(st.nextToken()); // 도로의 수(0<=E<=V*(V-1)/2)
			int n = Integer.parseInt(st.nextToken()); // 화재 장소의 수(1<=n)
			int m = Integer.parseInt(st.nextToken()); // 소방서의 수(1<=m, n+m<=V)
			
			path = new int[V+1][V+1];
			
			for(int i=0; i<E; i++){
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(String.valueOf(st.nextToken()));
				int y = Integer.parseInt(String.valueOf(st.nextToken()));
				path[x][y] = path[y][x] = Integer.parseInt(String.valueOf(st.nextToken()));
			}
			
			N = new int[n];	// 화재 장소 번호 
			M = new int[m];	// 소방서 장소 번호
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++){
				N[i] = Integer.parseInt(String.valueOf(st.nextToken()));
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<m; i++){
				M[i] = Integer.parseInt(String.valueOf(st.nextToken()));
			}
			
			// CALCULATE
			int sumMin = 0;
			for(int i=0; i<M.length; i++){
				min = Integer.MAX_VALUE;
				
				for(int j=0; j<N.length; j++){
					visit = new int[V+1];
					DFS_SP(M[i], N[j], 0);
					System.out.println(min);
				}	
				
				sumMin += min;
			}
			
			// OUTPUT
			System.out.println(sumMin);
		}
	}
	
	public static void DFS_SP(int cur, int end, int sum){
		visit[cur] = 1;
		
		if(cur==end){
			if(min>sum)
				min = sum;
			return;
		}
			
		
		for(int i=1; i<=V; i++){
			if(visit[i]==0 && path[cur][i]!=0){
				sum+=path[cur][i];
				if(sum>min){
					
				}
				else
					DFS_SP(i, end, sum);
			}	
		}
	}
}
