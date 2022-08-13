package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater array;

    @Before
    public void setUp() throws Exception {
	array = new ContainerWithMostWater();
    }

    @Test
    public void test() {
	int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

	assertEquals(49, array.maxArea(arr));

    }

}
