package algorithim.array;

public class TrappingWater {

    public int trappingWater(int[] arr) {

	int n = arr.length;
	if (arr == null || n == 1)
	    return 0;

	int[] L = new int[n];
	L[0] = 0;
	for (int i = 1; i < L.length; i++) {
	    L[i] = Math.max(arr[i], arr[L[i - 1]]) == arr[i] ? i : L[i - 1];
	}

	int[] R = new int[n];
	R[n - 1] = n - 1;
	for (int i = n - 2; i >= 0; i--) {
	    R[i] = Math.max(arr[i], arr[R[i + 1]]) == arr[i] ? i : R[i + 1];
	}

	for (int i = 0; i < L.length; i++) {
	    System.out.print(i + "=" + arr[L[i]] + " ");
	}

	System.out.println();

	for (int i = 0; i < R.length; i++) {
	    System.out.print(i + "=" + arr[R[i]] + " ");
	}

	int tw = 0;
	for (int i = 1; i < arr.length - 1; i++) {
	    if (L[i] != i && R[i] != i) {

		int leftTower = arr[L[i]];
		int rightTower = arr[R[i]];
		int minTower = Math.min(leftTower, rightTower);
		tw += minTower - arr[i];
	    }
	}

	return tw;
    }

    public int trappingWater2(int[] arr) {

	int n = arr.length;

	int l = 0, r = n - 1;
	int leftMax = 0, rightMax = 0;
	int tw = 0;
	while (l < r) {

	    if (arr[l] < arr[r]) {
		if (arr[l] < leftMax) {
		    tw += leftMax - arr[l];
		} else {
		    leftMax = arr[l];
		}
		l++;
	    } else {
		if (arr[r] < rightMax) {
		    tw += rightMax - arr[r];
		} else {
		    rightMax = arr[r];
		}
		r--;

	    }

	}

	return tw;
    }
}
