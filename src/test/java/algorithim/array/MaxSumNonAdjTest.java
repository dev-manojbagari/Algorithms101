package algorithim.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxSumNonAdjTest {

    MaxSumNonAdj array;

    @Before
    public void setUp() throws Exception {
	array = new MaxSumNonAdj();
    }

    @Test
    public void test() {
	Assert.assertEquals(110, array.findMaxSum(new int[] { 5, 5, 10, 100, 10, 5 }));
    }

    @Test
    public void test1() {
	Assert.assertEquals(13, array.findMaxSum(new int[] { 3, 2, 7, 10 }));
    }

}
