package algorithim.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithAtMost2DistinctCharactersTest {

    LongestSubstringWithAtMost2DistinctCharacters string;

    @Before
    public void setUp() throws Exception {
	string = new LongestSubstringWithAtMost2DistinctCharacters();
    }

    @Test
    public void test() {
	assertEquals(5, string.lengthOfLongestSubstringKDistinct("aabbccc", 2));
    }

}
