package algorithm.algospot.superbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encrypt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			String str = br.readLine();
			// CALCULATE
			String odd = "";
			String even = "";
			for(int i=0; i<str.length(); i++){
				if(i%2==0){
					odd += String.valueOf(str.charAt(i));
				}else{
					even += String.valueOf(str.charAt(i));
				}
			}
			
			String result = odd + even;
			// OUTPUT
			System.out.println(result);
		}
	}

}
