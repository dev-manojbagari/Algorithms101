package algorithim.array;

import java.util.Arrays;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
*/

public class ProductExceptSelf {
    // using extra space
    public int[] productExceptSelf(int[] nums) {
	int n = nums.length;
	if (nums == null || n == 0)
	    return null;

	int[] L = new int[n];
	Arrays.fill(L, 1);

	int[] R = new int[n];
	Arrays.fill(R, 1);

	L[0] = nums[0];
	for (int i = 1; i < L.length; i++) {
	    L[i] = L[i - 1] * nums[i];
	}

	R[n - 1] = nums[n - 1];
	for (int i = n - 2; i >= 0; i--) {
	    R[i] = R[i + 1] * nums[i];
	}

	for (int i = 0; i < n; i++) {
	    if (i == 0) {
		nums[i] = R[i + 1];

	    } else if (i == n - 1) {
		nums[i] = L[i - 1];

	    } else {
		nums[i] = L[i - 1] * R[i + 1];

	    }
	}

	return nums;
    }

    // using only nums
    public int[] productExceptSelf2(int[] nums) {
	int n = nums.length;
	if (nums == null || n == 0)
	    return null;
	int[] res = new int[nums.length];
	Arrays.fill(res, 1);

	res[0] = nums[0];
	for (int i = 1; i < nums.length; i++) {
	    res[i] = res[i - 1] * nums[i];
	}

	int k = 1;
	for (int i = n - 1; i > 0; i--) {
	    res[i] = res[i - 1] * k;
	    k = k * nums[i];
	}

	res[0] = k;

	return res;
    }

}
