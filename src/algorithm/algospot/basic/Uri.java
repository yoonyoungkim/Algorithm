package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		if((T>=1) && (T<=100))
			for (int testcase = 0; testcase < T; testcase++) {
				// INPUT
				String str = br.readLine();
				// CALCULATE
				if(str.length()>0 && str.length()<=80){
					str = str.replaceAll("%20", " ")
							 .replaceAll("%21", "!")
							 .replaceAll("%24", "\\$")
							 .replaceAll("%28", "(")
							 .replaceAll("%29", ")")
							 .replaceAll("%2a", "*")
							 .replaceAll("%25", "%");
					
					
					// OUTPUT
					System.out.println(str);
				}
				
			}
	}

}
