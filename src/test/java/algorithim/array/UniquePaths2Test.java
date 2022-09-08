package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UniquePaths2Test {
    UniquePaths2 array;

    @Before
    public void setUp() throws Exception {
	array = new UniquePaths2();
    }

    @Test
    public void test() {
	assertEquals(3, UniquePaths2.uniquePaths(3, 2));
    }

    @Test
    public void test2() {
	assertEquals(1, UniquePaths2.uniquePaths(1, 6));
    }

}
