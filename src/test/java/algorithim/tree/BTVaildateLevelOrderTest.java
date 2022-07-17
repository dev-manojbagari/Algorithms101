package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTVaildateLevelOrderTest {

    BTVaildateLevelOrder bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTVaildateLevelOrder();
    }

    @Test
    public void test() {

	int levelOrder1[] = { 20, 15, 25, 13, 17, 23, 27 };

	boolean isBST = bt.validateLevelOrder(levelOrder1);

	assertTrue(isBST);

	int levelOrder2[] = { 11, 6, 13, 5, 12, 10 };

	boolean isBST2 = bt.validateLevelOrder(levelOrder2);

	assertFalse(isBST2);

    }

}
