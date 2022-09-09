package algorithim.array;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class UniquePaths3Test {
    UniquePaths3 array;

    @Before
    public void setUp() throws Exception {
	UniquePaths3 array;
    }

    @Test
    public void test() {

	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	list.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
	list.add(new ArrayList<>(Arrays.asList(0, -1, 0)));
	list.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
	assertEquals(2, UniquePaths3.mazeObstacles(3, 3, list));
    }

    @Test
    public void test2() {
	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	list.add(new ArrayList<>(Arrays.asList(0, -1)));
	list.add(new ArrayList<>(Arrays.asList(-1, 0)));
	assertEquals(0, UniquePaths3.mazeObstacles(2, 2, list));
    }

    @Test
    public void test3() {
	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	list.add(new ArrayList<>(Arrays.asList(0, 0)));
	list.add(new ArrayList<>(Arrays.asList(0, 0)));
	assertEquals(2, UniquePaths3.mazeObstacles(2, 2, list));
    }

}
