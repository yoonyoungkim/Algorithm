package algorithm.basic.tiffany;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
3
4
1 1 2 2 2 4 3 4 1 7 2 1
4
7 2 1 3 4 1 2 2 4 1 1 2
3
4 3 7 1 2 6 6 4 3
 */

public class ProTest1608 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int testcase = 1; testcase <= T; testcase++) {
			// INPUT
			int N = Integer.parseInt(br.readLine());
			int[] x = new int[N + 1]; // 1<=x<=10,000
			int[] y = new int[N + 1]; // 1<=y<=10,000
			int[] s = new int[N + 1]; // 1<=z<=10,000
			st = new StringTokenizer(br.readLine());
			
			int[] arrX = new int[2*N];
			int[] arrY = new int[2*N];
			for (int i = 1; i <= N; i++) {
				x[i] = Integer.parseInt(st.nextToken());
				y[i] = Integer.parseInt(st.nextToken());
				s[i] = Integer.parseInt(st.nextToken());
				
				arrX[2*(i-1)] = x[i];
				arrX[2*(i-1)+1] = x[i]+s[i];
				arrY[2*(i-1)] = y[i];
				arrY[2*(i-1)+1] = y[i]+s[i];
			}
			
			Arrays.sort(arrX);
			Arrays.sort(arrY);
			int[][] area = new int[arrX.length][arrY.length];
			for(int i=1; i<arrX.length; i++){
				for(int j=1; j<arrY.length; j++){
					area[i][j]=(arrX[i]-arrX[i-1])*(arrY[j]-arrY[j-1]);
				}
			}
			
			

			// CALCULATE
			int[] result = new int[N+1];
			for(int i=N; i>0; i--){
				for(int j=0; j<arrX.length; j++){
					if(arrX[j]<=x[i]) continue;
					if(arrX[j]>x[i]+s[i]) break;
					for(int k=0; k<arrY.length; k++){
						if(arrY[k]<=y[i]) continue;
						if(arrY[k]>y[i]+s[i]) break;
						result[i]+=area[j][k];
						area[j][k]=0;
					}
				}
			}
			
			String maxColor = "";
			int maxCount=0;
			int max = -1;
			
			String minColor = "";
			int minCount=0;
			int min = Integer.MAX_VALUE;
			
			for(int i=0; i<result.length; i++){
				if(max<result[i]){
					max = result[i];
					maxCount = 1;
					maxColor = i + " " + result[i];
				}else if(max==result[i]){
					maxCount++;
					maxColor += " " + i + " " + result[i];
				}
				
				if(result[i]!=0 && min>result[i]){
					min = result[i];
					minCount =1;
					minColor = i + " " + result[i];
				}else if(min==result[i]){
					minCount++;
					minColor += " " + i + " " + result[i];
				}
			}
			
			// OUTPUT
			System.out.println("#" + testcase + " " + minCount + " " + minColor);
			System.out.println(maxCount + " " + maxColor);
		
		}
	}

	
}
