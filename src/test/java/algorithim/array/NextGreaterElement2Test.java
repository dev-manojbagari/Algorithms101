package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithim.array.NextGreaterElement2;

public class NextGreaterElement2Test {

    NextGreaterElement2 array;

    @Before
    public void setUp() throws Exception {
	array = new NextGreaterElement2();
    }

    @Test
    public void test() {
	int[] nextGreaterElement = array.nextGreaterElement(new int[] { 1, 2, 1 });
	Assert.assertEquals(Arrays.toString(new int[] { 2, -1, 2 }), Arrays.toString(nextGreaterElement));
    }

}
