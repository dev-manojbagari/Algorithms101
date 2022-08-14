package algorithim.string;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VaildAnagramTest {

    VaildAnagram string;

    @Before
    public void setUp() throws Exception {
	string = new VaildAnagram();
    }

    @Test
    public void test() {
	String str1 = "anagram";
	String str2 = "nagaram";
	assertTrue(string.vaildAnagram(str1, str2));
    }

}
