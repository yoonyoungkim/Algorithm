package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class Brackets2_Complete {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=0; testcase<T; testcase++){
			String input = br.readLine();
			Stack<String> s = new Stack<String>();
			String result = "NO";
			for(int i=0; i<input.length(); i++){
				String c = String.valueOf(input.charAt(i));
				if("({[".contains(c)){
					s.push(c);
				}else{
					String open = "";
					if(s.size()>0){
						open = s.pop();
					}else{
						break;
					}
						
					if((open.equals("(") && c.equals(")")) 
							|| (open.equals("{") && c.equals("}")) 
							|| (open.equals("[") && c.equals("]"))){
						if(i==input.length()-1 && s.size()==0)
							result ="YES";
					}else{
						break;
					}
				}
			}
			System.out.println(result);
		
		}
	}

}
