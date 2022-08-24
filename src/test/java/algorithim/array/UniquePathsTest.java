package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UniquePathsTest {
    UniquePaths array;

    @Before
    public void setUp() throws Exception {
	array = new UniquePaths();
    }

    @Test
    public void test() {
	assertEquals(28, array.uniquePaths(3, 7));
    }

    @Test
    public void test2() {
	assertEquals(3, array.uniquePaths(3, 2));
    }

}
