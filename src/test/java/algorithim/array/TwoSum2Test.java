package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSum2Test {

    TwoSum2 array;

    @Before
    public void setUp() throws Exception {
	array = new TwoSum2();
    }

    /*
     * 
     * Input: numbers = [2,7,11,15], target = 9 Output: [1,2] 2:numbers = [2,3,4],
     * target = 6 Output: [1,3] Explanation: The sum of 2 and 4 is 6. Therefore
     * index1 = 1, index2 = 3. We return [1, 3]. Example 3: Input: numbers = [-1,0],
     * target = -1 Output: [1,2] Explanation: The sum of -1 and 0 is -1. Therefore
     * index1 = 1, index2 = 2. We return [1, 2].
     * 
     */

    @Test
    public void test() {

	int[] arr = { 2, 7, 11, 15 };

	int[] indices = array.twoSum(arr, 9);

	Assert.assertEquals(Arrays.toString(new int[] { 1, 2 }), Arrays.toString(indices));// here returned indices
											   // start at 1 not
    }

}
