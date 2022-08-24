package algorithim.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class Find132pattern {

    public boolean find132pattern(int[] arr) {
	int min[] = new int[arr.length];

	min[0] = 0;

	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] < arr[min[i - 1]]) {
		min[i] = i;
	    } else {
		min[i] = min[i - 1];
	    }
	}

	Deque<Integer> stack = new ArrayDeque<>();

	for (int i = 0; i < arr.length; i++) {

	    while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
		stack.pop();
	    }

	    if (!stack.isEmpty()) {
		if (arr[min[stack.peek()]] < arr[i]) {
		    return true;
		}
	    }

	    stack.push(i);

	}

	return false;
    }

}
