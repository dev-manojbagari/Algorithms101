package algorithim.array;

import java.util.Arrays;

public class NinjasTraining {

    private static int[][] arr;
    private static int n;

    private static int dp[][];

    static int rec(int i, int prev) {

	if (i == n)
	    return 0;

	if (prev != -1 && dp[i][prev] != -1)
	    return dp[i][prev];

	int max = 0;
	for (int j = 0; j < n; j++) {
	    if (j != prev) {
		max = Math.max(max, arr[i][j] + rec(i + 1, j));
	    }
	}
	if (prev != -1)
	    dp[i][prev] = max;

	return max;
    }

    public static int ninjaTraining(int[][] x) {
	arr = x;
	n = x.length;
	int r = x.length;
	int c = x[0].length;
	dp = new int[r][c];

	for (int[] row : dp)
	    Arrays.fill(row, -1);

	return rec(0, -1);
    }

}
