package algorithim.array.monostack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {

    public int[] previousSmallerElement(int[] arr) {
	Stack<Integer> stack = new Stack<>();

	int[] previousSmaller = new int[arr.length];
	Arrays.fill(previousSmaller, -1);

	for (int i = 0; i < previousSmaller.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
		stack.pop();

	    if (!stack.isEmpty())
		previousSmaller[i] = stack.peek();

	    stack.push(i);
	}

	return previousSmaller;
    }

    public int[] previousSmallerElement2(int[] arr) {
	Stack<Integer> stack = new Stack<>();

	int[] previousSmaller = new int[arr.length];
	// Arrays.fill(previousSmaller, -1);

	for (int i = 0; i < previousSmaller.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] >= arr[i])
		stack.pop();

	    if (!stack.isEmpty())
		previousSmaller[i] = stack.peek();
	    else
		previousSmaller[i] = -1;

	    stack.push(i);
	}

	return previousSmaller;
    }

}
