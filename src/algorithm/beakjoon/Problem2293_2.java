package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2293_2 {
	static int[][] W;
	static int N;
	static int[][] mem;
	static int IMPOSSIBLE = Integer.MAX_VALUE;
	static int[] arr;
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
		arr = new int[N];
		mem = new int[N][1<<N];
		int visited = 0;
		int result = Integer.MAX_VALUE;
		int chooseIndex=-1;
		for(int i=0; i<N; i++){
			result = Math.min(result, TSP(i, i, visited|1<<i));
		}
		arr[0] = chooseIndex;
		
		// OUTPUT
		System.out.println(result);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int TSP(int startIndex, int curIndex, int visited){
		// index에 방문함을 표시
		
		// 모두 방문했으면, 시작점으로 돌아감
		if(visited==(1<<N)-1){
			mem[curIndex][visited] = W[curIndex][startIndex];
			return W[curIndex][startIndex];
		}
		int result = Integer.MAX_VALUE;
		int chooseIndex = -1;
		for(int i=0; i<N; i++){
			// 방문했으면 continue
			if(curIndex==i || (visited&1<<i) !=0){
				continue;
			}
			// 방문안했을 경우
			else{

				result = Math.min(result, W[curIndex][i] + TSP(startIndex, i, visited|1<<i));
			}
		}
		mem[curIndex][visited] = result;
		return result;
	}
}
