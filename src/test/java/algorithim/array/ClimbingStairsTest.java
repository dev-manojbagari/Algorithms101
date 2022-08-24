package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClimbingStairsTest {
    ClimbingStairs array;

    @Before
    public void setUp() throws Exception {
	array = new ClimbingStairs();
    }

    @Test
    public void test() {
	assertEquals(2, array.climbStairs(2));
    }

    @Test
    public void test2() {
	assertEquals(3, array.climbStairs(3));
    }

}
