package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithim.array.NumberOfVisiblePeopleInAQueue;

public class NumberOfVisiblePeopleInAQueueTest {

    NumberOfVisiblePeopleInAQueue array;

    @Before
    public void setUp() throws Exception {
	array = new NumberOfVisiblePeopleInAQueue();
    }

    @Test
    public void test() {
	Assert.assertEquals(Arrays.toString(new int[] { 3, 1, 2, 1, 1, 0 }),
		Arrays.toString(array.canSeePersonsCount(new int[] { 10, 6, 8, 5, 11, 9 })));
    }

    @Test
    public void test2() {
	Assert.assertEquals(Arrays.toString(new int[] { 4, 1, 1, 1, 0 }),
		Arrays.toString(array.canSeePersonsCount(new int[] { 5, 1, 2, 3, 10 })));
    }

}
