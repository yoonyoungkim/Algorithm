package algorithm.algospot.superbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Convert {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int testcase = 1; testcase <= T; testcase++) {
			// INPUT
			StringTokenizer st = new StringTokenizer(br.readLine());
			float number = Float.parseFloat(st.nextToken());
			String unit = st.nextToken();
			// CALCULATE
			String result = "";
			if(unit.equals("kg")){
				result = String.valueOf(String.format("%.4f", (float) (number*2.2046))) + " lb";
			}else if(unit.equals("l")){
				result = String.valueOf(String.format("%.4f", (float) (number*0.2642))) + " g";
			}else if(unit.equals("lb")){
				result = String.valueOf(String.format("%.4f", (float) (number*0.4536))) + " kg";
			}else{
				result = String.valueOf(String.format("%.4f", (float) (number*3.7854))) + " l";
			}
			// OUTPUT
			System.out.println(testcase + " " + result);
		}
	}

}
