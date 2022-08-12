package algorithim.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] arr) {
	if (arr == null || arr.length == 0)
	    return 0;

	Set<Integer> set = new HashSet<Integer>();

	for (int i = 0; i < arr.length; i++) {
	    set.add(arr[i]);
	}
	int max = 0;
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
	    count = 0;
	    if (!set.contains(arr[i] - 1)) {
		int temp = arr[i];
		count = 1;
		while (set.contains(temp + 1)) {
		    count++;
		    temp++;
		}
		max = Math.max(max, count);

	    }
	}

	return max;
    }

}
