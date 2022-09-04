package algorithim.array;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FindAllSubsetsThatSumToKTest {

    FindAllSubsetsThatSumToK array;

    @Before
    public void setUp() throws Exception {
	array = new FindAllSubsetsThatSumToK();
    }

    @Test
    public void test2() {
	ArrayList<ArrayList<Integer>> listofList = FindAllSubsetsThatSumToK
		.findSubsetsThatSumToK(new ArrayList<>(Arrays.asList(2, 3, 5, 6, 8, 10)), 0);

	List<Integer> list1 = Arrays.asList(2, 4, 6);
	List<Integer> list2 = new LinkedList<>();

	for (List<Integer> list : listofList) {
	    list2.addAll(list);
	}

	assertTrue(list1.containsAll(list2));

    }
}