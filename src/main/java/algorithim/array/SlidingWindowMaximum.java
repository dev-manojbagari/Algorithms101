package algorithim.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
	if (nums == null || k == 0)
	    return null;

	Deque<Integer> q = new ArrayDeque<>();
	int[] result = new int[nums.length - k + 1];

	for (int i = 0; i < nums.length; i++) {
	    if (!q.isEmpty() && q.peek() < i - k + 1) {
		q.poll();
	    }
	    while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
		q.pollLast();
	    }

	    q.offer(i);
	    if (i - k + 1 >= 0)
		result[i - k + 1] = nums[q.peek()];
	}

	return result;
    }

}
