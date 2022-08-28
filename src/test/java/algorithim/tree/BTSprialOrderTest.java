package algorithim.tree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTSprialOrderTest {
    BTSprialOrder bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTSprialOrder();

    }

    @Test
    public void btSprialOrderIterTest() {

	bt.root = BTUtil.convert("3,9,20,null,null,15,7");
	List<List<Integer>> list1 = Arrays.asList(Arrays.asList(3), Arrays.asList(20, 9), Arrays.asList(15, 7));
	List<List<Integer>> list2 = bt.btSprialOrderIter(bt.root);

	assertEquals(list1, list2);

    }

    @Test
    public void btSprialOrderRecurTest() {

	bt.root = BTUtil.convert("3,9,20,null,null,15,7");
	List<List<Integer>> list1 = Arrays.asList(Arrays.asList(3), Arrays.asList(20, 9), Arrays.asList(15, 7));
	List<List<Integer>> list2 = bt.btSprialOrderRecursive(bt.root);

	assertEquals(list1, list2);

    }

}
