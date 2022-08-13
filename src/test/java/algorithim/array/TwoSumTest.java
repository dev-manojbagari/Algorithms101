package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

    TwoSum array;

    @Before
    public void setUp() throws Exception {
	array = new TwoSum();
    }

    @Test
    public void test() {
	int[] arr = { 2, 7, 11, 15 };

	int[] indices = array.twoSum(arr, 9);

	Assert.assertEquals(Arrays.toString(new int[] { 0, 1 }), Arrays.toString(indices));
    }

}
