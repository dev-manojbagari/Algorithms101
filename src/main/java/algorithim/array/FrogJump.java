package algorithim.array;

import java.util.Arrays;

public class FrogJump {

    static int n;
    static int[] arr;
    static int[] dp;

    static int rec(int level) {
	if (level >= n)
	    return Integer.MAX_VALUE;

	if (dp[level] != -1)
	    return dp[level];

	if (level == n - 1)
	    return dp[level] = 0;

	int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
	if (level + 1 < n)
	    a = rec(level + 1) + Math.abs(arr[level + 1] - arr[level]);
	if (level + 2 < n)
	    b = rec(level + 2) + Math.abs(arr[level + 2] - arr[level]);

	return dp[level] = Math.min(a, b);
    }

    public static int frogJump(int length, int[] a) {
	n = a.length;
	arr = a;
	dp = new int[n];
	Arrays.fill(dp, -1);
	return rec(0);
    }

}
