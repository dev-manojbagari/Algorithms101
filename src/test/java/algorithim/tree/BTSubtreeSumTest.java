package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTSubtreeSumTest {

    BTSubtreeSum bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTSubtreeSum();
    }

    @Test
    public void test() {

	bt.root = BTUtil.convert("1 3 6 5 9 8 -1");
	assertTrue(bt.subtreeSum(bt.root, 17));
	assertFalse(bt.subtreeSum(bt.root, 11));

    }

}
