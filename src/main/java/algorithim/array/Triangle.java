package algorithim.array;

import java.util.Arrays;
import java.util.List;

public class Triangle {

    int n;
    List<List<Integer>> list;
    int[][] dp;

    int rec(int level, int i) {

	if (i >= list.get(level).size())
	    return Integer.MAX_VALUE;

	if (level + 1 == list.size())
	    return list.get(level).get(i);

	if (dp[level][i] != -1)
	    return dp[level][i];

	int ans = Integer.MAX_VALUE;
	if (list.get(level + 1).size() > i)
	    ans = Math.min(ans, list.get(level).get(i) + rec(level + 1, i));

	if (list.get(level + 1).size() > i + 1)
	    ans = Math.min(ans, list.get(level).get(i) + rec(level + 1, i + 1));

	return dp[level][i] = ans;
    }

    public int minimumTotal(List<List<Integer>> grid) {

	list = grid;
	n = list.size();
	dp = new int[n][n];
	for (int[] row : dp)
	    Arrays.fill(row, -1);

	return rec(0, 0);
    }

}
