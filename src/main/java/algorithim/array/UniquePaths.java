package algorithim.array;

import java.util.Arrays;

public class UniquePaths {

    public int uniquePaths2(int m, int n) {

	int[][] dp = new int[m][n];

	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++) {

		if (i == 0 || j == 0)
		    dp[i][j] = 1;
		else
		    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
	    }
	}

	return dp[m - 1][n - 1];
    }

    public int uniquePaths(int m, int n) {

	int[] dp = new int[n];
	Arrays.fill(dp, 1);
	for (int j = 0; j < m - 1; j++) {
	    for (int i = 1; i < n; i++) {
		dp[i] = dp[i - 1] + dp[i];
	    }
	}

	return dp[n - 1];
    }

}
