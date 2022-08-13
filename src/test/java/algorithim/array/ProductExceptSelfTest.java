package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductExceptSelfTest {

    ProductExceptSelf array;

    @Before
    public void setUp() throws Exception {
	array = new ProductExceptSelf();
    }

    /*
     * Example 1: Input: nums = [1,2,3,4] Output: [24,12,8,6] Example 2: Input: nums
     * = [-1,1,0,-3,3] Output: [0,0,9,0,0]
     */

    @Test
    public void test() {

	int[] arr = { 1, 2, 3, 4 };

	Assert.assertEquals(Arrays.toString(new int[] { 24, 12, 8, 6 }),
		Arrays.toString(array.productExceptSelf2(arr)));

    }

    @Test
    public void test2() {

	int[] arr = { -1, 1, 0, -3, 3 };

	Assert.assertEquals(Arrays.toString(new int[] { 0, 0, 9, 0, 0 }),
		Arrays.toString(array.productExceptSelf2(arr)));

    }

}
