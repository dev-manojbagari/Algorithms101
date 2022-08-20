package algorithim.array;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

    public int[] nextSmallerElement(int[] arr) {

	Stack<Integer> stack = new Stack<>();

	int[] nextSmaller = new int[arr.length];
	Arrays.fill(nextSmaller, -1);

	for (int i = 0; i < nextSmaller.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] > arr[i])
		nextSmaller[stack.pop()] = i;
	    stack.push(i);
	}

	return nextSmaller;
    }

    public int[] nextSmallerElement2(int[] arr) {

	Stack<Integer> stack = new Stack<>();

	int[] nextSmaller = new int[arr.length];
	// Arrays.fill(nextSmaller, -1);

	for (int i = 0; i < nextSmaller.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] > arr[i])
		nextSmaller[stack.pop()] = i;
	    stack.push(i);
	}

	while (!stack.isEmpty())
	    nextSmaller[stack.pop()] = -1;

	return nextSmaller;
    }

}
