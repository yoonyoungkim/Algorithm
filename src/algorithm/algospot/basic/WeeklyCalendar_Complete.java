package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WeeklyCalendar_Complete {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			// CALCULATE
			int[] lastday = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
			
			// 몇번째 요일인지 계산
			int index=-1;
			for(int i=0; i<dayOfWeek.length; i++){
				if(s.equals(dayOfWeek[i])){
					index = i;
					break;
				}
			}
			
			int startDate = d-index;
			if(startDate<=0){
				m--;
				if(m<=0){
					m = m+12;
					startDate += lastday[m];
				}else{
					startDate += lastday[m];
				}	
			}
			
			String result = "";
			int tempDate = startDate;
			for(int i=0; i<7; i++){
				result += tempDate + " ";
				tempDate++;
				if(tempDate>lastday[m]){
					tempDate = tempDate-lastday[m];
					m++;
					if(m>12)
						m = m-12;
				}
			}
			
			// OUTPUT
			System.out.println(result);
		}
	}
}
