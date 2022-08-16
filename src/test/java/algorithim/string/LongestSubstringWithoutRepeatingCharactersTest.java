package algorithim.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters string;

    @Before
    public void setUp() throws Exception {
	string = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void test() {

	assertEquals(3, string.nonRepeatingSubstring("abcabcbb"));

    }

    @Test
    public void test2() {

	assertEquals(1, string.nonRepeatingSubstring("bbbbb"));

    }

    @Test
    public void test3() {

	assertEquals(3, string.nonRepeatingSubstring("pwwkew"));

    }

}
