package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TSP2 {
	static double[][] W;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// INPUT
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int testcase=0; testcase<T; testcase++){
			N = Integer.parseInt(br.readLine());
			W = new double[N][N];
			
			StringTokenizer st;
			for(int i=0; i<N ;i++){
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++){
					W[i][j] = Double.parseDouble(st.nextToken());
				}
			}
			
			// CALCULATE
			int visited = 0;
			double min = Double.MAX_VALUE;
			for(int i=0; i<N; i++){
				double result = TSP(i, i, visited);
				if(min>result)
					min = result;
			}
			
			// OUTPUT
			System.out.println(min);
		}
	}
	
	public static double TSP(int startIndex, int curIndex, int visited){
		// index에 방문함을 표시
		visited += Math.pow(2, curIndex);
				
		// 모두 방문했으면, 시작점으로 돌아감
		if(Integer.bitCount(visited) == N){
			return 0;
		}
		
		double result = Double.MAX_VALUE;
		for(int i=0; i<N; i++){
			// 방문했으면 continue
			if(curIndex==i || ((int)Math.pow(2, i)&visited) !=0){
				continue;
			}
			
			// 방문안했을 경우
			else{
				double pathLength = W[curIndex][i] + TSP(startIndex, i, visited);
				if(pathLength<result){
					result = pathLength;
				}	
			}
		}
		
		return result;
	}
}
