package algorithm.algospot.superbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Lecture {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			String inputStr = br.readLine();
			// CALCULATE
			ArrayList<String> arrList = new ArrayList<String>();
			for(int i=0; i<inputStr.length(); i=i+2){
				arrList.add(inputStr.substring(i, i+2));
			}
			Collections.sort(arrList);
			
			String result = "";
			for(int i=0; i<arrList.size(); i++){
				result += arrList.get(i);
			}
			// OUTPUT
			System.out.println(result);
		}
	}
}
