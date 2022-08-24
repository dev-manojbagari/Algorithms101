package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DailyTemperaturesTest {
    DailyTemperatures array;

    @Before
    public void setUp() throws Exception {
	array = new DailyTemperatures();
    }

    @Test
    public void test() {
	int[] r = array.dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
	Assert.assertEquals(Arrays.toString(new int[] { 1, 1, 4, 2, 1, 1, 0, 0 }), Arrays.toString(r));
    }

    @Test
    public void test2() {
	int[] r = array.dailyTemperatures(new int[] { 30, 40, 50, 60 });
	Assert.assertEquals(Arrays.toString(new int[] { 1, 1, 1, 0 }), Arrays.toString(r));
    }

    @Test
    public void test3() {
	int[] r = array.dailyTemperatures(new int[] { 30, 60, 90 });
	Assert.assertEquals(Arrays.toString(new int[] { 1, 1, 0 }), Arrays.toString(r));
    }
}
