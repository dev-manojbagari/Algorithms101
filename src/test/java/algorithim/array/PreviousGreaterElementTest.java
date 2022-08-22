package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithim.array.PreviousGreaterElement;

public class PreviousGreaterElementTest {

    PreviousGreaterElement array;

    @Before
    public void setUp() throws Exception {
	array = new PreviousGreaterElement();
    }

    @Test
    public void test() {
	int[] PGE = array.previousGreaterElement(new int[] { 13, 8, 1, 5, 2, 5, 9, 7, 6, 12 });
	Assert.assertEquals(Arrays.toString(new int[] { -1, 0, 1, 1, 3, 1, 0, 6, 7, 0 }), Arrays.toString(PGE));

    }

}
