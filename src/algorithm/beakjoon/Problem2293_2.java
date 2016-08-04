package algorithm.beakjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2293_2 {

	static int N;
	static int[][] W;
	static int IMPOSSIBLE = Integer.MAX_VALUE;
	static int[][] mem;
	static int result = IMPOSSIBLE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// INPUT
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		W = new int[N][N];
		StringTokenizer st;
		for(int i=0; i<N; i++){
			st = new  StringTokenizer(br.readLine());
			for(int j=0; j<N; j++){
				W[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// CALCULATE
		mem = new int[N][1<<N];
		result = Math.min(result, TSP(0, 0, 1));
		
		// OUTPUT
		System.out.println(result);
	}
	
	public static int TSP(int startIndex, int index, int visited){
		// memorizaton 된 경우
		if(mem[index][visited]>0){
			return mem[index][visited];
		}
		
		// 모든 노드를 방문했을 경우
		if(visited == ((1<<N)-1)){
			if(W[index][startIndex]>0)
				return W[index][startIndex];
			else
				return IMPOSSIBLE;
		}
			
		int result = IMPOSSIBLE;
		for(int i=0; i<N; i++){
			// 이미 방문한 노드에거나 갈수 없는 길인 경우
			if((visited&(1<<i))!=0 || W[index][i]==0){
				continue;
			}
			
			result = Math.min(result, W[index][i] + TSP(startIndex, i, visited|1<<i));
		}
		mem[index][visited] = result;
		return result;
	}

}
