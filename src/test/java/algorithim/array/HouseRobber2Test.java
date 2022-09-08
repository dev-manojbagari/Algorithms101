package algorithim.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HouseRobber2Test {
    HouseRobber2 array;

    @Before
    public void setUp() throws Exception {
	array = new HouseRobber2();
    }

    @Test
    public void test() {
	Assert.assertEquals(3, array.rob(new int[] { 2, 3, 2 }));
    }

    @Test
    public void test1() {
	Assert.assertEquals(4, array.rob(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    public void test2() {
	Assert.assertEquals(3, array.rob(new int[] { 1, 2, 3 }));
    }
}
