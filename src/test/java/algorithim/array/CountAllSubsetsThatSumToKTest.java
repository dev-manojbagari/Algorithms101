package algorithim.array;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CountAllSubsetsThatSumToKTest {

    CountAllSubsetsThatSumToK array;

    @Before
    public void setUp() throws Exception {
	array = new CountAllSubsetsThatSumToK();
    }

    @Test
    public void test() {

	int n = array.perfectSum(new ArrayList<Integer>(Arrays.asList(2, 3, 5, 6, 8, 10)), 6, 10);
	assertEquals(3, n);
    }

}
