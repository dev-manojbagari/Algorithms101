package algorithim.array;

import java.util.Arrays;

public class SubsetSum {

    int targetSum;
    int n;
    int[] arr;
    int dp[][];

    boolean rec(int level, int curSum) {

	if (level == n)
	    return curSum == targetSum;

	if (dp[level][curSum] != -1)
	    return dp[level][curSum] == 1 ? true : false;

	boolean include = false, exclude = false;
	if (curSum + arr[level] <= targetSum) {
	    include = rec(level + 1, curSum + arr[level]);
	    if (include)
		return include;
	    exclude = rec(level + 1, curSum);
	} else {
	    exclude = rec(level + 1, curSum);
	}

	dp[level][curSum] = include || exclude ? 1 : 0;

	return include || exclude;
    }

    public boolean isSubsetSum(int[] arr, int k) {
	this.arr = arr;
	targetSum = k;
	n = arr.length;
	int sum = 0;
	for (int i : arr)
	    sum += i;
	dp = new int[105][sum];
	for (int[] row : dp)
	    Arrays.fill(row, -1);

	return rec(0, 0);
    }

}
