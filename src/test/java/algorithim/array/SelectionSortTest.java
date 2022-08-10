package algorithim.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

    SelectionSort array;;

    @Before
    public void setUp() throws Exception {
	array = new SelectionSort();
    }

    @Test
    public void sort() {
	int[] A = { 3, 1, 5, 8, 6, 9, 2, 4, 7 };

	array.selectionSort(A);

	Assert.assertEquals(Arrays.toString(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }), Arrays.toString(A));
    }

}
