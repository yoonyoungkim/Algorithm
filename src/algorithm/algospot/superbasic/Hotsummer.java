package algorithm.algospot.superbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hotsummer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			int[] A = new int[9];
			int goal = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int result = 0;
			// CALCULATE
			for(int i=0; i<9; i++){
				result += Integer.parseInt(st.nextToken());
			}
			
			// OUTPUT
			if(result<=goal){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
