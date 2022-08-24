package algorithim.array;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] arr) {

	Stack<Integer> stack = new Stack<>();
	int result[] = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
		result[stack.peek()] = i - stack.pop();
	    }

	    stack.push(i);

	}

	return result;
    }

}
