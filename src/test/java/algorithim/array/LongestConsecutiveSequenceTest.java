package algorithim.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence array;

    @Before
    public void setUp() throws Exception {
	array = new LongestConsecutiveSequence();
    }

    /*
     * Example 1: Input: nums = [100,4,200,1,3,2] Output: 4 Example 2: Input: nums =
     * [0,3,7,2,5,8,4,6,0,1] Output: 9
     * 
     */
    @Test
    public void test() {
	int[] arr = { 100, 4, 200, 1, 3, 2 };

	Assert.assertEquals(4, array.longestConsecutive(arr));
    }

    @Test
    public void test2() {
	int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

	Assert.assertEquals(9, array.longestConsecutive(arr));
    }

// [9,1,4,7,3,-1,0,5,8,-1,6]
    @Test
    public void test3() {
	int[] arr = { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 };

	Assert.assertEquals(7, array.longestConsecutive(arr));
    }
}
