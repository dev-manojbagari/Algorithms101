package algorithim.array;

import java.util.Arrays;

public class UniquePaths2 {

    private static int m, n;

    private static int dp[][];

    private static int rec(int row, int col) {

	if (dp[row][col] != -1)
	    return dp[row][col];

	if (row == m - 1 && col == n - 1) {
	    return dp[row][col] = 1;
	}

	int r = 0;
	int d = 0;

	if (row == m - 1) {
	    r = rec(row, col + 1);
	} else if (col == n - 1) {
	    d = rec(row + 1, col);
	} else {
	    r = rec(row, col + 1);
	    d = rec(row + 1, col);
	}

	return dp[row][col] = r + d;
    }

    public static int uniquePaths(int row, int col) {
	m = row;
	n = col;
	dp = new int[m][n];

	for (int[] r : dp)
	    Arrays.fill(r, -1);

	return rec(0, 0);
    }

}
