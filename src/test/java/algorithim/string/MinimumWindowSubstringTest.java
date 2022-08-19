package algorithim.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinimumWindowSubstringTest {

    MinimumWindowSubstring string;

    @Before
    public void setUp() throws Exception {
	string = new MinimumWindowSubstring();
    }

    @Test
    public void test() {

	assertEquals("BANC", string.minWindow("ADOBECODEBANC", "ABC"));

    }

    @Test
    public void test2() {

	assertEquals("a", string.minWindow("a", "a"));

    }

    @Test
    public void test3() {

	assertEquals("", string.minWindow("a", "aa"));

    }

}
