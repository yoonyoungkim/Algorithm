package algorithm.algospot.superbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MercifulAlgospot {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// INPUT
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// CALCULATE
		int N = Integer.parseInt(br.readLine());
		// OUTPUT
		for(int i=0; i<N; i++){
			System.out.println("Hello Algospot!");
		}
	}

}
