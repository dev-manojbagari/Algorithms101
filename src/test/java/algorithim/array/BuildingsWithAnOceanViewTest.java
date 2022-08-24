package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuildingsWithAnOceanViewTest {

    BuildingsWithAnOceanView array;

    @Before
    public void setUp() throws Exception {
	array = new BuildingsWithAnOceanView();
    }

    @Test
    public void test() {
	int[] b = array.findBuildings(new int[] { 4, 2, 3, 1 });
//	assertTrue(a.length == b.length && Arrays.asList(a).containsAll(Arrays.asList(b)));
	Assert.assertEquals(Arrays.toString(new int[] { 3, 2, 0 }), Arrays.toString(b));
    }

    @Test
    public void test2() {
	int[] r = array.findBuildings(new int[] { 4, 3, 2, 1 });
	Assert.assertEquals(Arrays.toString(new int[] { 3, 2, 1, 0 }), Arrays.toString(r));
    }

    @Test
    public void test3() {
	int[] r = array.findBuildings(new int[] { 1, 3, 2, 4 });
	Assert.assertEquals(Arrays.toString(new int[] { 3 }), Arrays.toString(r));
    }

    @Test
    public void test4() {
	int[] r = array.findBuildings(new int[] { 2, 2, 2, 2 });
	Assert.assertEquals(Arrays.toString(new int[] { 3 }), Arrays.toString(r));
    }
}
