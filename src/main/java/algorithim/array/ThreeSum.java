package algorithim.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] arr, int target) {
	List<List<Integer>> list = new ArrayList<>();
	Arrays.sort(arr);

	for (int i = 0; i < arr.length - 2; i++) {

	    if (i == 0 || arr[i] != arr[i - 1]) {
		int j = i + 1;
		int k = arr.length - 1;

		while (j < k) {

		    if (arr[i] + arr[j] + arr[k] < target) {
			j++;
		    } else if (arr[i] + arr[j] + arr[k] > target) {
			k--;
		    } else {
			list.add(Arrays.asList(arr[i], arr[j], arr[k]));
			while (j < k && arr[j] == arr[j + 1]) {
			    j++;
			}
			while (j < k && arr[k] == arr[k - 1]) {
			    k--;
			}

			j++;
			k--;
		    }

		}
	    }
	}

	return list;
    }

}
