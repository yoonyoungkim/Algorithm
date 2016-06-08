package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Weird {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		if(T<=200)
			for (int testcase = 0; testcase < T; testcase++) {
				// INPUT
				int n = Integer.parseInt(br.readLine());	// 500000>=n>1
				// CALCULATE
				ArrayList<Integer> list = new ArrayList<Integer>();
				int count = 0;
				while (true) {
					count++;
					if (count * count > n)
						break;
					if (n % count == 0) {
						if (n / count == n || n / count == count)
							list.add(count);
						else {
							list.add(count);
							list.add(n / count);
						}
					}
				}
				//Collections.sort(list);
	
				int sum = 0;
				String result = "weird";
				for (int i = list.size() - 1; i >= 0; i--) {
					sum += list.get(i);
				}
				if(list.contains(sum-n))
					result = "not weird";
				// OUTPUT
				System.out.println(result);
			}
	}
	
}
