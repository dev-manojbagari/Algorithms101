package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram array;

    @Before
    public void setUp() throws Exception {
	array = new LargestRectangleInHistogram();
    }

    @Test
    public void test() {
	assertEquals(10, array.largestRectangleArea3(new int[] { 2, 1, 5, 6, 2, 3 }));
    }

    @Test
    public void test2() {
	assertEquals(4, array.largestRectangleArea3(new int[] { 2, 4 }));
    }

    @Test
    public void test3() {
	assertEquals(2, array.largestRectangleArea3(new int[] { 1, 1 }));
    }

}
