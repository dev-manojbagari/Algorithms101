package algorithim.array;

import java.util.HashMap;
import java.util.Map;

/*
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
public class TwoSum {

    public int[] twoSum(int[] arr, int target) {

	Map<Integer, Integer> map = new HashMap<>();

	for (int i = 0; i < arr.length; i++) {

	    if (map.containsKey(target - arr[i])) {
		return new int[] { map.get(target - arr[i]), i };
	    } else
		map.put(arr[i], i);

	}

	return null;
    }

}
