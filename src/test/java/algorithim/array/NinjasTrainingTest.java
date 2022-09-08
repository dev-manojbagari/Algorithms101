package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NinjasTrainingTest {
    NinjasTraining array;

    @Before
    public void setUp() throws Exception {
	array = new NinjasTraining();
    }

    @Test
    public void test() {
	assertEquals(11, NinjasTraining.ninjaTraining(new int[][] { { 1, 2, 5 }, { 3, 1, 1 }, { 3, 3, 3 } }));
    }

    @Test
    public void test2() {
	assertEquals(210, NinjasTraining.ninjaTraining(new int[][] { { 10, 40, 70 }, { 20, 50, 80 }, { 30, 60, 90 } }));
    }

}
