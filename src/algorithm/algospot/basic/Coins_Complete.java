package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coins_Complete {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());	// 1<=T<=100
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int[] coins = new int[C+1];
			st = new StringTokenizer(br.readLine());
			for(int i=1; i<=C; i++){
				coins[i] = Integer.parseInt(st.nextToken());
			}
			
			long[][] count = new long[C+1][M+1];
			// CALCULATE
			for(int i=1; i<=C; i++){
				for(int j=0; j<=M; j++){
					// ������ �ܵ� coins[i]�� ���� �� �� + ������ �ܵ� coins[i]�� ���Ե��� ���� ��
					if(i==0 || j==0)
						count[i][j] = 1;
					else if(j>=coins[i])
						count[i][j] = count[i-1][j] + count[i][j-coins[i]];
					else
						count[i][j] = count[i-1][j];
				}
			}
			// OUTPUT
			int result = (int)(count[C][M]%1000000007);
			System.out.println(result);
		}
	}
}
