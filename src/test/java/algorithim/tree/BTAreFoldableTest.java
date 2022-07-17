package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTAreFoldableTest {

    BTAreFoldable bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTAreFoldable();

    }

    @Test
    public void test1() {

	BTAreFoldable bt1 = new BTAreFoldable();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(2);

	BTAreFoldable bt2 = new BTAreFoldable();
	bt2.root = new TreeNode(1);
	bt2.root.right = new TreeNode(3);

	assertTrue(bt.areFoldable(bt1.root, bt2.root));

    }

    @Test
    public void test2() {

	BTAreFoldable bt1 = new BTAreFoldable();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(2);

	BTAreFoldable bt2 = new BTAreFoldable();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(2);

	assertFalse(bt.areFoldable(bt1.root, bt2.root));

    }
}
