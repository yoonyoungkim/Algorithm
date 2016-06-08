package algorithm.algospot.superbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Endians {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());	// C (1 ≤ C ≤ 10, 000)
		
		for(int testcase=0; testcase<C; testcase++){
			// INPUT
			long N = Long.parseLong(br.readLine());
			
			// CALCULATE
			// 2진수로 변환
			String binary = Long.toBinaryString(N);
			// 자리 바꾸기
			int prefixNumber = 32-binary.length();
			for(int i=0; i<prefixNumber; i++)
				binary = "0"+binary;
			
			String result = "";
			while(binary.length()!=0){
				result =  binary.substring(0, 8) + result;
				binary = binary.substring(8);
			}
			
			// OUTPUT
			System.out.println(Long.parseLong(result, 2));
			
		}
	}
}
