package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTLCATest {

    BTLCA bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTLCA();
    }

    @Test
    public void test() {
	bt.root = BTUtil.convert("1 2 3 4 7 -1 -1 -1 -1 -1 -1");
	TreeNode lca = bt.lca(bt.root, 4, 7);

	assertEquals(2, lca.val);

    }

    // 1 2 3 -1 -1 -1 -1
    @Test
    public void test2() {
	bt.root = BTUtil.convert("1 2 3 -1 -1 -1 -1");
	TreeNode lca = bt.lca(bt.root, 2, 3);

	assertEquals(1, lca.val);

    }

    // 4 3 -1 -1 -1
    @Test
    public void test4() {
	bt.root = BTUtil.convert("4 3 -1 -1 -1");
	TreeNode lca = bt.lca(bt.root, 4, 3);

	assertEquals(4, lca.val);

    }

    // 1 4 2 -1 -1 -1 3 -1 -1
    @Test
    public void test5() {
	bt.root = BTUtil.convert("1 4 2 -1 -1 -1 3 -1 -1");
	TreeNode lca = bt.lca(bt.root, 4, 3);

	assertEquals(1, lca.val);

    }

    @Test
    public void test6() {
	bt.root = BTUtil.convert("10 2 -1 13 -1 6 -1 8 -1 11 -1 12 -1 20 -1 5 -1 16 -1 -1 -1 ");
	TreeNode lca = bt.lca(bt.root, 5, 16);

	assertEquals(5, lca.val);

    }

}
