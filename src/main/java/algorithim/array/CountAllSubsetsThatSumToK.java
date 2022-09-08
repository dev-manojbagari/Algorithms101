package algorithim.array;

import java.util.ArrayList;
import java.util.Arrays;

public class CountAllSubsetsThatSumToK {

    int N;
    int target;
    ArrayList<Integer> arr;
    int count;
    int dp[][];

    private boolean rec(int level, int curSum) {

	if (level == N) {
	    if (curSum == target) {
		count++;
		return true;
	    }
	    return false;
	}
	if (dp[level][curSum] != -1) {
	    if (dp[level][curSum] == 1) {
		count++;
	    }

	    return dp[level][curSum] == 1 ? true : false;
	}

	boolean include = false, exclude = false;
	include = rec(level + 1, curSum + arr.get(level));
	exclude = rec(level + 1, curSum);

	dp[level][curSum] = include || exclude ? 1 : 0;

	return include || exclude;
    }

    public int perfectSum(ArrayList<Integer> a, int n, int k) {
	arr = a;
	N = n;
	target = k;

	int sum = 0;
	for (int i : a)
	    sum += i;

	dp = new int[1000008][sum];
	for (int[] row : dp)
	    Arrays.fill(row, -1);

	rec(0, 0);

	return count;
    }
}
