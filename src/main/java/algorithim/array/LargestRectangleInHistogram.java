package algorithim.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {

	Stack<Integer> stack = new Stack<>();

	int[] ns = new int[heights.length];
	int[] ps = new int[heights.length];

	ps[0] = -1;
	stack.add(0);
	for (int i = 1; i < ps.length; i++) {
	    while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
		stack.pop();

	    ps[i] = stack.isEmpty() ? -1 : stack.peek();
	    stack.push(i);
	}
	stack.clear();

	ns[heights.length - 1] = heights.length;
	stack.add(heights.length - 1);
	for (int i = heights.length - 2; i >= 0; i--) {
	    while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
		stack.pop();

	    ns[i] = stack.isEmpty() ? heights.length : stack.peek();
	    stack.push(i);
	}

	int area = 0, maxArea = Integer.MIN_VALUE;
	for (int i = 0; i < ps.length; i++) {
	    area = (ns[i] - ps[i] - 1) * heights[i];
	    maxArea = Math.max(maxArea, area);
	}

	return maxArea;
    }

    public int largestRectangleArea2(int[] height) {
	if (height == null || height.length == 0) {
	    return 0;
	}
	int N = height.length;
	int[] stack = new int[N];
	int si = -1;
	int maxArea = 0;
	for (int i = 0; i < height.length; i++) {
	    while (si != -1 && height[i] <= height[stack[si]]) {
		int j = stack[si--];
		int k = si == -1 ? -1 : stack[si];
		int curArea = (i - k - 1) * height[j];
		maxArea = Math.max(maxArea, curArea);
	    }
	    stack[++si] = i;
	}
	while (si != -1) {
	    int j = stack[si--];
	    int k = si == -1 ? -1 : stack[si];
	    int curArea = (height.length - k - 1) * height[j];
	    maxArea = Math.max(maxArea, curArea);
	}
	return maxArea;
    }

    public int largestRectangleArea3(int[] heights) {
	Deque<Integer> stack = new ArrayDeque<>();
	stack.push(-1);
	int length = heights.length;
	int maxArea = 0;
	for (int i = 0; i < length; i++) {
	    while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
		int currentHeight = heights[stack.pop()];
		int currentWidth = i - stack.peek() - 1;
		maxArea = Math.max(maxArea, currentHeight * currentWidth);
	    }
	    stack.push(i);
	}
	while (stack.peek() != -1) {
	    int currentHeight = heights[stack.pop()];
	    int currentWidth = length - stack.peek() - 1;
	    maxArea = Math.max(maxArea, currentHeight * currentWidth);
	}
	return maxArea;
    }

}
