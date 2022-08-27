package algorithim.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    int[] q;
    List<List<String>> list;

    private int rec(int row, int n, int[] q) {
	if (row == n) {
	    List<String> tempList = new ArrayList<>();
	    for (int i = 0; i < q.length; i++) {
		StringBuilder sb = new StringBuilder();
		int j = q[i];
		for (int j2 = 0; j2 < j; j2++) {
		    sb.append(".");
		}
		sb.append("Q");
		for (int j2 = j + 1; j2 < q.length; j2++) {
		    sb.append(".");
		}
		tempList.add(sb.toString());
	    }
	    list.add(tempList);
	    return 1;

	}
	int ways = 0;
	for (int col = 0; col < n; col++) {

	    if (check(row, col, n)) {
		q[row] = col;
		ways += rec(row + 1, n, q);
		q[row] = -1;
	    }

	}

	return ways;
    }

    private boolean check(int row, int col, int n) {
	for (int i = 0; i < row; i++) {
	    int pr = i;
	    int pc = q[i];

	    if (col == pc || Math.abs(col - pc) == Math.abs(row - pr))
		return false;
	}

	return true;
    }

    public List<List<String>> solveNQueens(int n) {

	q = new int[n];
	Arrays.fill(q, -1);
	list = new ArrayList<>();

	int x = rec(0, n, q);

	return list;
    }

}
