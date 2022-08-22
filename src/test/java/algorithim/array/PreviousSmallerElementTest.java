package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithim.array.PreviousSmallerElement;

public class PreviousSmallerElementTest {

    PreviousSmallerElement array;

    @Before
    public void setUp() throws Exception {
	array = new PreviousSmallerElement();
    }

    @Test
    public void test() {
	int[] NSE = array.previousSmallerElement(new int[] { 13, 8, 1, 5, 2, 5, 9, 7, 6, 12 });
	Assert.assertEquals(Arrays.toString(new int[] { -1, -1, -1, 2, 2, 4, 5, 5, 5, 8 }), Arrays.toString(NSE));

    }

}
