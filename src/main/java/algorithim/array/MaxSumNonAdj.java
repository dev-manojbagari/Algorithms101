package algorithim.array;

import java.util.Arrays;

public class MaxSumNonAdj {

    int[] arr;
    int n;
    int dp[][];

    int rec(int i, int prevIncluded) {

	if (i == n)
	    return 0;

	if (dp[i][prevIncluded] != -1)
	    return dp[i][prevIncluded];

	int incl = 0;
	int excl = 0;
	if (prevIncluded == 0)
	    incl = arr[i] + rec(i + 1, 1);
	excl = rec(i + 1, 0);

	return dp[i][prevIncluded] = Math.max(incl, excl);
    }

    public int findMaxSum2(int[] arr) {
	this.arr = arr;
	n = arr.length;
	dp = new int[n][2];
	for (int[] row : dp)
	    Arrays.fill(row, -1);

	return rec(0, 0);
    }

    public int findMaxSum(int[] arr) {

	int curIncl = 0, curExcl = 0, prevIncl = 0, prevExcl;
	int max = 0;
	for (int i = 0; i < arr.length; i++) {
	    prevExcl = curExcl;
	    prevIncl = curIncl;
	    curIncl = arr[i] + prevExcl;
	    curExcl = Math.max(prevIncl, prevExcl);
	    max = Math.max(curExcl, curIncl);
	}

	return max;
    }

}
