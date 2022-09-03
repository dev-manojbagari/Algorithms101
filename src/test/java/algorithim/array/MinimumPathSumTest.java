package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinimumPathSumTest {
    MinimumPathSum array;

    @Before
    public void setUp() throws Exception {
	array = new MinimumPathSum();
    }

    @Test
    public void test() {
	int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
	assertEquals(7, array.minPathSum(grid));
    }

    @Test
    public void test2() {
	int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 } };
	assertEquals(12, array.minPathSum(grid));
    }

}
