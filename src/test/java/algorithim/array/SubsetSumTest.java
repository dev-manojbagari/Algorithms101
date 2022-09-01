package algorithim.array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SubsetSumTest {

    SubsetSum array;

    @Before
    public void setUp() throws Exception {
	array = new SubsetSum();
    }

    @Test
    public void test() {
	assertTrue(array.isSubsetSum(new int[] { 3, 34, 4, 12, 5, 2 }, 14));
    }

    @Test
    public void test2() {
	assertFalse(array.isSubsetSum(new int[] { 3, 34, 4, 12, 5, 2 }, 35));
    }

    @Test
    public void test3() {
	assertTrue(array.isSubsetSum(new int[] { 4, 3, 2, 1 }, 5));
    }

}
