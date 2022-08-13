package algorithim.array;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeSumTest {

    ThreeSum array;

    @Before
    public void setUp() throws Exception {
	array = new ThreeSum();
    }

    @Test
    public void test() {

	int[] arr = { -1, 0, 1, 2, -1, -4 };

	List<List<Integer>> indices = array.threeSum(arr, 0);

	List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
	Assert.assertEquals(expected, indices);

    }

}
