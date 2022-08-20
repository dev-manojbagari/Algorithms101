package algorithim.array;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {

    public int[] previousGreaterElement(int[] arr) {

	Stack<Integer> stack = new Stack<>();

	int[] previousGreater = new int[arr.length];
	Arrays.fill(previousGreater, -1);

	for (int i = 0; i < previousGreater.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] <= arr[i])
		stack.pop();

	    if (!stack.isEmpty())
		previousGreater[i] = stack.peek();

	    stack.push(i);
	}

	return previousGreater;
    }

    public int[] nextGreaterElement(int[] arr) {

	Stack<Integer> stack = new Stack<>();

	int[] nextGreater = new int[arr.length];
	Arrays.fill(nextGreater, -1);

	for (int i = 0; i < nextGreater.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] < arr[i])
		nextGreater[stack.pop()] = i;
	    stack.push(i);
	}

	return nextGreater;
    }

}
