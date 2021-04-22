package dp;

import java.util.Scanner;

public class ClimbStairs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		System.out.println(climbStairsMemoization(n, new int[n + 1]));
		System.out.println(climbStairsTabulation(n));
	}

	//Memoization
	public static int climbStairsMemoization(int n, int[] qb) {
		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}
		if (qb[n] != 0) {
			return qb[n];
		}
		int nm1 = climbStairsMemoization(n - 1, qb);
		int nm2 = climbStairsMemoization(n - 2, qb);
		int nm3 = climbStairsMemoization(n - 3, qb);
		qb[n] = nm1 + nm2 + nm3;
		return nm1 + nm2 + nm3;
	}

	// Tabulation
	public static int climbStairsTabulation(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			if (i== 1) {
				dp[i] = dp[i] + dp[i - 1];
			} else if (i == 2) {
				dp[i] = dp[i] + dp[i - 1] + dp[i - 2];
			} else {
				dp[i] = dp[i] + dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
		}
		return dp[n];
	}
}
