package algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2098 {
	static int count = 0;
	static int[] coin;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k;
		// INPUT
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}

		// CALCULATE
		count = 0;
		int remain = k;
		int currentIndex = -1;
		while (true) {
			if (remain >= coin[0]) {
				remain -= coin[0];
				currentIndex++;
			} else {
				break;
			}
		}
		System.out.println(currentIndex);
		System.out.println(remain);
		// countCoin(0, currentIndex, remain);

		// OUTPUT
		System.out.println(count);
	}

	public static void countCoin(int index, int currentIndex, int remain) {
		
	}
}
