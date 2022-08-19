package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SlidingWindowMaximumTest {

    SlidingWindowMaximum array;

    @Before
    public void setUp() throws Exception {
	array = new SlidingWindowMaximum();
    }

    @Test
    public void test() {
	int[] max = array.maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3);
	Assert.assertEquals(Arrays.toString(new int[] { 3, 3, 5, 5, 6, 7 }), Arrays.toString(max));
    }

    @Test
    public void test1() {
	int[] max = array.maxSlidingWindow(new int[] { 1 }, 1);
	Assert.assertEquals(Arrays.toString(new int[] { 1 }), Arrays.toString(max));
    }

    // [1,3,1,2,0,5]
    @Test
    public void test2() {
	int[] max = array.maxSlidingWindow(new int[] { 1, 3, 1, 2, 0, 5 }, 3);
	Assert.assertEquals(Arrays.toString(new int[] { 3, 3, 2, 5 }), Arrays.toString(max));
    }
}
