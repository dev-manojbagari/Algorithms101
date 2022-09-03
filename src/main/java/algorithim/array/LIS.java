package algorithim.array;

import java.util.Arrays;

public class LIS {

    int n;
    int arr[];
    int dp[];

    int rec(int level) {

	// pruning
	if (level < 0)
	    return 0;

	// base
	// cache
	if (dp[level] != -1)
	    return dp[level];

	// computatin
	int ans = 1;
	for (int i = 0; i < level; i++) {
	    if (arr[i] < arr[level])
		ans = Math.max(ans, 1 + rec(i));
	}

	// save and return

	return dp[level] = ans;
    }

    // form1
    public int lengthOfLIS(int[] a) {
	arr = a;
	n = arr.length;
	dp = new int[n];
	Arrays.fill(dp, -1);
	rec(n - 1);
	int max = 1;

	for (int i = 0; i < n; i++) {
	    max = Math.max(max, rec(i));
	}

	return max;
    }

}
