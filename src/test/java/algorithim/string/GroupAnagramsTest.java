package algorithim.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GroupAnagramsTest {

    GroupAnagrams string;

    @Before
    public void setUp() throws Exception {
	string = new GroupAnagrams();
    }

    @Test
    public void test() {
	String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
	List<List<String>> expected = Arrays.asList(Arrays.asList("bat"), Arrays.asList("nat", "tan"),
		Arrays.asList("ate", "eat", "tea"));

	List<List<String>> actual = string.groupAnagram(str);

	List<String> one = new ArrayList<String>();

	expected.forEach(i -> one.addAll(i));

	List<String> two = new ArrayList<String>();

	actual.forEach(i -> two.addAll(i));

	assertEquals(one.size(), two.size());
	assertTrue(one.containsAll(two));
	assertTrue(two.containsAll(one));
    }

}
