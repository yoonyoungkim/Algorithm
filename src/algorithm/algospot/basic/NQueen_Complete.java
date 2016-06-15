package algorithm.algospot.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen_Complete {
	static int N;
	static int[] mapIndex;
	static int count;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int testcase = 0; testcase < T; testcase++) {
			// INPUT
			N = Integer.parseInt(br.readLine());
			mapIndex = new int[N + 1];
			count = 0;

			// CALCULATE
			getNQueenMap(0);

			// OUTPUT
			System.out.println(count);
		}
	}

	public static void getNQueenMap(int index) {
		if (isPossible(index)) {
			if (index == N) {
				// System.out.println(Arrays.toString(mapIndex));
				count++;
			} else {
				for (int i = 1; i <= N; i++) {
					mapIndex[index + 1] = i;
					getNQueenMap(index + 1);
				}
			}
		}
	}

	public static boolean isPossible(int index) {
		boolean result = true;

		for (int i = 1; i < index; i++) {
			if (mapIndex[index] == mapIndex[i]
					|| (Math.abs(index - i) == Math.abs(mapIndex[index]
							- mapIndex[i]))) {
				result = false;
				break;
			}
		}

		return result;
	}
}
