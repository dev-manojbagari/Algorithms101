package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DungeonGameTest {
    DungeonGame array;

    @Before
    public void setUp() throws Exception {
	array = new DungeonGame();
    }

    @Test
    public void test() {
	int[][] grid = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
	assertEquals(7, array.calculateMinimumHP(grid));
    }

    @Test
    public void test2() {
	int[][] grid = { { -3, 5 } };
	assertEquals(4, array.calculateMinimumHP(grid));
    }
    // [[0,0,0],[1,1,-1]]

    @Test
    public void test3() {
	int[][] grid = { { 0, 0, 0 }, { 1, 1, -1 } };
	assertEquals(1, array.calculateMinimumHP(grid));
    }

}
