package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithim.array.NextGreaterElement1;

public class NextGreaterElement1Test {

    NextGreaterElement1 array;

    @Before
    public void setUp() throws Exception {
	array = new NextGreaterElement1();
    }

    @Test
    public void test() {
	int[] nextGreaterElement = array.nextGreaterElement(new int[] { 4, 1, 2 }, new int[] { 1, 3, 4, 2 });
	Assert.assertEquals(Arrays.toString(new int[] { -1, 3, -1 }), Arrays.toString(nextGreaterElement));
    }

    @Test
    public void test2() {

	int[] nextGreaterElement = array.nextGreaterElement(new int[] { 2, 4 }, new int[] { 1, 2, 3, 4 });
	Assert.assertEquals(Arrays.toString(new int[] { 3, -1 }), Arrays.toString(nextGreaterElement));

    }

}
