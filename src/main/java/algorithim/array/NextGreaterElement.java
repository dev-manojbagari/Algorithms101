package algorithim.array;

import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] arr) {

	Stack<Integer> stack = new Stack<>();

	int[] nextGreater = new int[arr.length];

	for (int i = 0; i < nextGreater.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] < arr[i])
		nextGreater[stack.pop()] = i;
	    stack.push(i);
	}

	while (!stack.isEmpty())
	    nextGreater[stack.pop()] = -1;

	return nextGreater;
    }

}
