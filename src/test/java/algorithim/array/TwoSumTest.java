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
	int[] arr = { 3, 2, 4 };

	int[] indices = array.twoSum(arr, 6);

	Assert.assertEquals(Arrays.toString(new int[] { 1, 2 }), Arrays.toString(indices));
    }

}
