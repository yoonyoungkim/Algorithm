package algorithm.beakjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int n = Integer.parseInt(br.readLine());
			int[] cx = new int[n];
			int[] cy = new int[n];
			int[] r = new int[n];
			
			int result = 0;
			for(int i=0; i<n ;i++){
				st = new StringTokenizer(br.readLine());
				cx[i] = Integer.parseInt(st.nextToken());
				cy[i] = Integer.parseInt(st.nextToken());
				r[i] = Integer.parseInt(st.nextToken());
				
				// CALCULATE
				boolean include1 = false;
				boolean include2 = false;
				if((cx[i]-x1)*(cx[i]-x1) + (cy[i]-y1)*(cy[i]-y1) < r[i]*r[i])
					include1 = true;
				if((cx[i]-x2)*(cx[i]-x2) + (cy[i]-y2)*(cy[i]-y2) < r[i]*r[i])
					include2 = true;
				
				if((!include1&&include2) || (include1&&!include2)){
					result++;
				}
			}
			
			// OUTPUT
			System.out.println(result);
		}
	}

}
