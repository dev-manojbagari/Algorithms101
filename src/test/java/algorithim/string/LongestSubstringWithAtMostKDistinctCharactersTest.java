package algorithim.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithAtMostKDistinctCharactersTest {

    LongestSubstringWithAtMostKDistinctCharacters string;

    @Before
    public void setUp() throws Exception {
	string = new LongestSubstringWithAtMostKDistinctCharacters();
    }

    @Test
    public void test() {
	assertEquals(3, string.lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    @Test
    public void test2() {
	assertEquals(2, string.lengthOfLongestSubstringKDistinct("aa", 1));
    }

    // abbbbbbc

    @Test
    public void test3() {
	assertEquals(7, string.lengthOfLongestSubstringKDistinct("abbbbbbc", 2));
    }

}
