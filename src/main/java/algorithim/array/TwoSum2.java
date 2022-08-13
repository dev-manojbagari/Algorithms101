package algorithim.array;

public class TwoSum2 {

    public int[] twoSum(int[] arr, int target) {
	if (arr == null || arr.length == 1)
	    return null;

	int i = 0;
	int j = arr.length - 1;

	while (i < j) {
	    if (arr[i] + arr[j] < target) {
		i++;
	    } else if (arr[i] + arr[j] > target) {
		j--;
	    } else {
		return new int[] { i + 1, j + 1 };
	    }
	}

	return null;
    }

}
