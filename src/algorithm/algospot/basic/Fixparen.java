package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Fixparen {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			// INPUT
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			String priority = st.nextToken();
		
			// CALCULATE
			Stack<String> stack = new Stack<String>();
			String result = "";
			String subResult = "";
			for(int i=0; i<input.length(); i++){
				if(priority.contains(String.valueOf(input.charAt(i)))){
					result += subResult;
					subResult = "";
					stack.push(String.valueOf(input.charAt(i)));
				}else{
					String s = stack.pop();
					String e = String.valueOf(input.charAt(i));
					
					String temp = getOpp(s);
					
					if(priority.indexOf(temp)>priority.indexOf(s)){
						subResult = s + subResult + getOpp(s);
					}else{
						subResult = getOpp(e) + subResult + e;
					}
				}
			}
			
			result += subResult;
			// OUTPUT
			System.out.println(result);
		}
	}
	
	public static String getOpp(String input){
		String result = "";
		switch(input){
		case ")":
			result = "(";
			break;
		case "}":
			result = "{";
			break;
		case "]":
			result = "[";
			break;
		case ">":
			result = "<";
			break;
		case "(":
			result = ")";
			break;
		case "{":
			result = "}";
			break;
		case "[":
			result = "]";
			break;
		case "<":
			result = ">";
			break;
		}
		return result;
	}
}
