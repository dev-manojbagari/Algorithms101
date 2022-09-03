package algorithim.array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    Triangle array;

    @Before
    public void setUp() throws Exception {
	array = new Triangle();
    }

    @Test
    public void test() {
	List<List<Integer>> grid = Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7),
		Arrays.asList(4, 1, 8, 3));
	assertEquals(11, array.minimumTotal(grid));
    }

    @Test
    public void test2() {
	List<List<Integer>> grid = Arrays.asList(Arrays.asList(-10));
	assertEquals(-10, array.minimumTotal(grid));
    }

}
