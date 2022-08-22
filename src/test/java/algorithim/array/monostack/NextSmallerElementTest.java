package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NextSmallerElementTest {

    NextSmallerElement array;

    @Before
    public void setUp() throws Exception {
	array = new NextSmallerElement();
    }

    @Test
    public void test() {
	int[] NSE = array.nextSmallerElement(new int[] { 13, 8, 1, 5, 2, 5, 9, 7, 6, 12 });
	Assert.assertEquals(Arrays.toString(new int[] { 1, 2, -1, 4, -1, -1, 7, 8, -1, -1 }), Arrays.toString(NSE));

    }

}
