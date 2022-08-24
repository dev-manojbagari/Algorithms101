package algorithim.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

	int ng[] = new int[nums2.length];
	Stack<Integer> stack = new Stack<>();
	for (int i = 0; i < nums2.length; i++) {

	    while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]) {
		int stackTop = stack.pop();
		ng[stackTop] = i;
	    }

	    stack.push(i);
	}

	while (!stack.isEmpty())
	    ng[stack.pop()] = -1;

	int result[] = new int[nums1.length];

	Map<Integer, Integer> map = new HashMap<>();

	for (int i = 0; i < nums2.length; i++) {
	    map.put(nums2[i], i);
	}

	for (int i = 0; i < nums1.length; i++) {
	    Integer ngIndex = map.get(nums1[i]);
	    result[i] = ng[ngIndex] == -1 ? -1 : nums2[ng[ngIndex]];
	}

	return result;
    }

}
