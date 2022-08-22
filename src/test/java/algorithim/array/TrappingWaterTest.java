package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TrappingWaterTest {

    TrappingWater array;

    @Before
    public void setUp() throws Exception {
	array = new TrappingWater();
    }

    @Test
    public void test() {
	int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

	assertEquals(6, array.trappingWater(arr));

    }

    @Test
    public void test2() {
	int[] arr = { 4, 2, 3 };

	assertEquals(1, array.trappingWater(arr));

    }

}
