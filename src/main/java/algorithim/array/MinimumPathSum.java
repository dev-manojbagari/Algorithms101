package algorithim.array;

import java.util.Arrays;

public class MinimumPathSum {

    int n;
    int arr[][];

    int dp[][];

    int rec(int row, int col) {

	if (row < 0 || col < 0)
	    return Integer.MAX_VALUE;

	if (row == 0 && col == 0)
	    return arr[row][col];

	if (dp[row][col] != -1)
	    return dp[row][col];

	int ans = Integer.MAX_VALUE;
	int val = arr[row][col];

	if (row == 0)
	    ans = Math.min(ans, val + rec(row, col - 1));
	else if (col == 0)
	    ans = Math.min(ans, val + rec(row - 1, col));
	else {
	    ans = Math.min(ans, val + rec(row - 1, col));
	    ans = Math.min(ans, val + rec(row, col - 1));
	}
	return dp[row][col] = ans;
    }

    public int minPathSum(int[][] grid) {

	arr = grid;
	int row = grid.length;
	int col = grid[0].length;

	dp = new int[row][col];

	for (int[] i : dp) {
	    Arrays.fill(i, -1);
	}

	return rec(row - 1, col - 1);
    }

}
