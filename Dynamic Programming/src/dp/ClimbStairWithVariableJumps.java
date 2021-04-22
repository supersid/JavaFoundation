package dp;

import java.util.Scanner;

public class ClimbStairWithVariableJumps {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		int[] dp = new int[n + 1];
		dp[n] = 1; // There is only one move left at the end which is don't move.
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 1; j <= arr[i] && i + j < dp.length; ; j++) {
				dp[i] += dp[i + j];
			}
		}
		System.out.println(dp[0]);
	}
}
