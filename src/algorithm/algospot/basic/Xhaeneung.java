package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Xhaeneung {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			StringTokenizer st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			String operation = st.nextToken();
			String B = st.nextToken();
			st.nextToken();
			String C = st.nextToken();
			
			// CALCULATE
			String result = "";
			int result1;
			int result2 = getNumber(C);
			if(operation.equals("+")){
				result1 = getNumber(A)+getNumber(B);
			}else if(operation.equals("-")){
				result1 = getNumber(A)-getNumber(B);
			}else{
				result1 = getNumber(A)*getNumber(B);
			}
			
			if(result1>=0 && result1<=10){
				if(result1==result2){
					result = "Yes";
				}else{
					result = "No";
				}
			}else{
				result = "No";
			}
			// OUTPUT
			System.out.println(result);
		}
	}
	
	// zero, one, two, three, four, five
	// six, seven, eight, nine, ten
	public static int getNumber(String str){
		int length = str.length();
		if(length==3){
			// one, two, six, ten 
			if(str.contains("o") && str.contains("n") && str.contains("e"))
				return 1;
			else if(str.contains("t") && str.contains("w") && str.contains("o"))
				return 2;
			else if(str.contains("s") && str.contains("i") && str.contains("x"))
				return 6;
			else if(str.contains("t") && str.contains("e") && str.contains("n"))
				return 10;
			else
				return -1;
		}else if(length==4){
			// zero, four, five, nine
			if(str.contains("z") && str.contains("e") && str.contains("r") && str.contains("o"))
				return 0;
			else if(str.contains("f") && str.contains("o") && str.contains("u") && str.contains("r"))
				return 4;
			else if(str.contains("f") && str.contains("i") && str.contains("v") && str.contains("e"))
				return 5;
			else if(str.contains("i") && str.contains("e")){
				int countN = 0;
				for(int i=0; i<length; i++){
					if(str.charAt(i)=='n')
						countN++;
				}
				if(countN==2)
					return 9;
				else
					return -1;
			}else
				return -1;
		}else if(length == 5){
			// three, seven, eight
			if(str.contains("t") && str.contains("h") && str.contains("r")){
				int countE = 0;
				for(int i=0; i<length; i++){
					if(str.charAt(i)=='e')
						countE++;
				}
				if(countE==2)
					return 3;
				else
					return -1;
			}else if(str.contains("s") && str.contains("v") && str.contains("n")){
				int countE = 0;
				for(int i=0; i<length; i++){
					if(str.charAt(i)=='e')
						countE++;
				}
				if(countE==2)
					return 7;
				else
					return -1;
			}else if(str.contains("e") && str.contains("i") && str.contains("g") && str.contains("h") && str.contains("t"))
				return 8;
			else
				return -1;
		}else
			return -1;
	}
}
