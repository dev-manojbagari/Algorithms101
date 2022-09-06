package algorithim.array;

import java.util.Arrays;

public class DungeonGame {

    int[][] arr;
    int m;
    int n;
    int dp[][];

    int rec(int row, int col) {
	if (row == m - 1 && col == n - 1)
	    return arr[row][col] >= 0 ? 1 : 1 + Math.abs(arr[row][col]);

	if (dp[row][col] != -1)
	    return dp[row][col];

	int r = Integer.MAX_VALUE, d = Integer.MAX_VALUE;
	if (row == m - 1) {
	    r = rec(row, col + 1) - arr[row][col];
	    if (r <= 0)
		r = 1;
	} else if (col == n - 1) {
	    d = rec(row + 1, col) - arr[row][col];
	    if (d <= 0)
		d = 1;

	} else {
	    r = rec(row + 1, col) - arr[row][col];
	    if (r <= 0)
		r = 1;

	    d = rec(row, col + 1) - arr[row][col];
	    if (d <= 0)
		d = 1;

	}

	return dp[row][col] = Math.min(r, d);
    }

    public int calculateMinimumHP(int[][] grid) {
	m = grid.length;
	n = grid[0].length;
	dp = new int[m][n];
	for (int[] row : dp)
	    Arrays.fill(row, -1);

	this.arr = grid;
	int ans = rec(0, 0);
	return ans;
    }

}
