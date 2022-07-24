package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTIsSubtreeTest {

    BTIsSubtree bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTIsSubtree();
    }

    @Test
    public void test() {
	bt.root = BTUtil.convert("1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1");

	TreeNode s = BTUtil.convert("3 6 7 -1 -1 -1 -1");

	assertTrue(bt.isSubtree2(bt.root, s));

    }

    @Test
    public void test2() {
	bt.root = BTUtil.convert("12");

	TreeNode s = BTUtil.convert("2");

	assertFalse(bt.isSubtree2(bt.root, s));

    }

}
