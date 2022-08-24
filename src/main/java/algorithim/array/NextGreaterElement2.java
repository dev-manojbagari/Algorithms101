package algorithim.array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {

    public int[] nextGreaterElement(int[] arr) {

	Stack<Integer> stack = new Stack<>();

	int[] nextGreater = new int[arr.length];
	Arrays.fill(nextGreater, -1);

	for (int j = 0; j < 2; j++) {

	    for (int i = 0; i < nextGreater.length; i++) {
		while (!stack.isEmpty() && arr[stack.peek()] < arr[i])
		    nextGreater[stack.pop()] = arr[i];
		stack.push(i);
	    }
	}

	return nextGreater;

    }

}
