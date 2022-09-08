package algorithim.array;

public class HouseRobber2 {

    public int rob(int[] arr) {
	if (arr.length == 1)
	    return arr[0];

	return Math.max(rob(arr, 0, arr.length - 2), rob(arr, 1, arr.length - 1));
    }

    public int rob(int[] arr, int start, int end) {

	int curIncl = 0, curExcl = 0, prevIncl = 0, prevExcl;
	int max = 0;
	for (int i = start; i <= end; i++) {
	    prevExcl = curExcl;
	    prevIncl = curIncl;
	    curIncl = arr[i] + prevExcl;
	    curExcl = Math.max(prevIncl, prevExcl);
	    max = Math.max(curExcl, curIncl);
	}

	return max;

    }

}
