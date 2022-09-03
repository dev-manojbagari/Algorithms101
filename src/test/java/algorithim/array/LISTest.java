package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LISTest {

    LIS array;

    @Before
    public void setUp() throws Exception {
	array = new LIS();
    }

    @Test
    public void test() {
	assertEquals(4, array.lengthOfLIS(new int[] { 0, 3, 1, 6, 2, 2, 7 }));
    }

    @Test
    public void test2() {
	assertEquals(4, array.lengthOfLIS(new int[] { 0, 1, 0, 3, 2, 3 }));
    }

    @Test
    public void test3() {
	assertEquals(2, array.lengthOfLIS(new int[] { 10, 9, 2, 5 }));
    }

}
