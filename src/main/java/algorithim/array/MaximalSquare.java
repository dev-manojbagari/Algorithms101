package algorithim.array;

public class MaximalSquare {

    public int maximalSquare(char[][] x) {

	int m = x.length;
	int n = x[0].length;
	int[][] dp = new int[m][n];
	int max = 0;
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++) {
		if (i == 0 || j == 0)
		    dp[i][j] = x[i][j] - '0';
		else if (x[i][j] - '0' == 0)
		    dp[i][j] = 0;
		else {
		    if (dp[i - 1][j - 1] == 0 || dp[i][j - 1] == 0 || dp[i - 1][j] == 0)
			dp[i][j] = 1;
		    else
			dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
		}

		max = Math.max(max, dp[i][j]);
	    }
	}

	return max * max;
    }

}
