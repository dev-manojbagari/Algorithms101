package algorithim.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestRepeatingCharacterReplacementTest {

    LongestRepeatingCharacterReplacement string;

    @Before
    public void setUp() throws Exception {
	string = new LongestRepeatingCharacterReplacement();
    }

    @Test
    public void test() {
	int len = string.characterReplacement("ABAB", 2);
	assertEquals(4, len);
    }

    @Test
    public void test2() {
	int len = string.characterReplacement("AABABBA", 1);
	assertEquals(4, len);
    }

}
