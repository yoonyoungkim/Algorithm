package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int testcase=0; testcase<T; testcase++){
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			int R1 = (r1+r2)*(r1+r2);
			int R2 = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
			
			if(x1==x2 && y1==y2){
				if(r1==r2)
					System.out.println(-1);
				else
					System.out.println(0);
			}else if(R1==R2){
				System.out.println(1);
			}else if(R1>R2){
				System.out.println(2);
			}else{
				System.out.println(0);
			}
		}
	}

}
