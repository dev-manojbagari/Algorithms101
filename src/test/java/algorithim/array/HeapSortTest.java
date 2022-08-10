package algorithim.array;

import static org.junit.Assert.assertNull;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeapSortTest {

    HeapSort array;;

    @Before
    public void setUp() throws Exception {
	array = new HeapSort();
    }

    @Test
    public void test() {
	int[] A = { 3, 1, 5, 8, 6, 9, 2, 4, 7 };

	array.heapSort(A);

	Assert.assertEquals(Arrays.toString(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }), Arrays.toString(A));
    }

    @Test
    public void test1() {
	int[] A = null;

	array.heapSort(A);

	assertNull(A);
    }

}
