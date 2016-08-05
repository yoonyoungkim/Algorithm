package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1002 {

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
			
			int plusRadius = r1+r2;
			int minusRadius = r1-r2;
			int distance = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
			
			// 일치할 경우
			if(distance==0 && r1==r2){
				System.out.println(-1);
			}
			// 만나지 않을 경우 
			else if(plusRadius*plusRadius<distance || minusRadius*minusRadius>distance){
				System.out.println(0);
			}
			// 한점에서 만날 경우 
			else if(plusRadius*plusRadius==distance || minusRadius*minusRadius ==distance){
				System.out.println(1);
			}
			// 두점에서 만날 경우 
			else if(plusRadius*plusRadius>distance && distance> minusRadius*minusRadius){
				System.out.println(2);
			}
		}
	}

}
