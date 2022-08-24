package algorithim.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildingsWithAnOceanView {

    public int[] findBuildings(int[] arr) {

	List<Integer> list = new ArrayList<>();

	Stack<Integer> stack = new Stack<>();

	for (int i = 0; i < arr.length; i++) {
	    while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
		stack.pop();
	    }
	    stack.push(i);
	}

	while (!stack.isEmpty())
	    list.add(stack.pop());

	return list.stream().mapToInt(i -> i.intValue()).toArray();
    }

}
