package algorithm.brain.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LCS {

	static int[][] mem;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = " " + br.readLine();
		String str2 = " " + br.readLine();
		
		mem = new int[str1.length()+1][str2.length()+1];
		LCS(str1, str2);
		System.out.println(mem[str1.length()-1][str2.length()-1]);
	}
	
	public static void LCS(String str1, String str2){
		for(int i=0; i<str1.length(); i++){
			for(int j=0; j<str2.length(); j++){
				if(i==0 || j==0)
					mem[i][j] = 0;
				else if(str1.charAt(i) == str2.charAt(j))
					mem[i][j] = mem[i-1][j-1]+1;
				else
					mem[i][j] = Math.max(mem[i][j-1], mem[i-1][j]);
			}
		}
	}
}
