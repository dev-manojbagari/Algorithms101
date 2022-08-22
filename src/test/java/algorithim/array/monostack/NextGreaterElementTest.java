package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NextGreaterElementTest {

    NextGreaterElement array;

    @Before
    public void setUp() throws Exception {
	array = new NextGreaterElement();
    }

    @Test
    public void test() {
	int[] NGE = array.nextGreaterElement(new int[] { 13, 8, 1, 5, 2, 5, 9, 7, 6, 12 });
	Assert.assertEquals(Arrays.toString(new int[] { -1, 6, 3, 6, 5, 6, 9, 9, 9, -1 }),
		Arrays.toString(NGE));

    }

}
