package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TSP1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			int N = Integer.parseInt(br.readLine());	// N<=8
			double[][] map = new double[N][N];
			StringTokenizer st;
			for(int i=0; i<N; i++){
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++){
					map[i][j] = Double.parseDouble(st.nextToken());
				}
			}
			
			// CALCULATE
			// OUTPUT
		}
	}
}
