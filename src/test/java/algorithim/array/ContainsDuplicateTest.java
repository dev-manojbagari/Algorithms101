package algorithim.array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicateTest {

    ContainsDuplicate array;

    @Before
    public void setUp() throws Exception {
	array = new ContainsDuplicate();
    }

    @Test
    public void test() {
	int[] arr = { 1, 2, 3, 1 };
	assertTrue(array.containsDuplicate(arr));
    }

    @Test
    public void test2() {
	int[] arr = { 1, 2, 3 };
	assertFalse(array.containsDuplicate(arr));
    }

}
