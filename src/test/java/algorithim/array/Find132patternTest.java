package algorithim.array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Find132patternTest {

    Find132pattern array;

    @Before
    public void setUp() throws Exception {
	array = new Find132pattern();
    }

    @Test
    public void test() {
	assertFalse(array.find132pattern(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    public void test2() {
	assertTrue(array.find132pattern(new int[] { 3, 1, 4, 2 }));
    }

    @Test
    public void test3() {
	assertTrue(array.find132pattern(new int[] { -1, 3, 2, 0 }));
    }

}
