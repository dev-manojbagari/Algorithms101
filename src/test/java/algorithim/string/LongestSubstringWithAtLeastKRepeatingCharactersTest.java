package algorithim.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithAtLeastKRepeatingCharactersTest {

    LongestSubstringWithAtLeastKRepeatingCharacters string;

    @Before
    public void setUp() throws Exception {
	string = new LongestSubstringWithAtLeastKRepeatingCharacters();
    }

    @Test
    public void test() {
	assertEquals(3, string.longestSubstringAtLeastKRepeating("aaabb", 3));
    }

    @Test
    public void test2() {
	assertEquals(5, string.longestSubstringAtLeastKRepeating("ababbc", 2));
    }

}
