package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTAreSameStructureTest {

    BTAreSameStructure bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTAreSameStructure();

    }

    @Test
    public void test1() {

	BTAreSameStructure bt1 = new BTAreSameStructure();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(2);
	bt1.root.left.left = new TreeNode(4);
	bt1.root.left.right = new TreeNode(5);
	bt1.root.right = new TreeNode(3);
	bt1.root.right.left = new TreeNode(6);
	bt1.root.right.right = new TreeNode(7);

	BTAreSameStructure bt2 = new BTAreSameStructure();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(2);
	bt2.root.left.left = new TreeNode(4);
	bt2.root.left.right = new TreeNode(5);
	bt2.root.right = new TreeNode(3);
	bt2.root.right.left = new TreeNode(6);
	bt2.root.right.right = new TreeNode(7);

	assertTrue(bt.areSameStructure(bt1.root, bt2.root));

    }

    @Test
    public void test2() {

	BTAreSameStructure bt1 = new BTAreSameStructure();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(2);
	bt1.root.left.left = new TreeNode(4);
	bt1.root.left.right = new TreeNode(5);
	bt1.root.right = new TreeNode(3);
	bt1.root.right.left = new TreeNode(6);

	BTAreSameStructure bt2 = new BTAreSameStructure();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(2);
	bt2.root.left.left = new TreeNode(4);
	bt2.root.left.right = new TreeNode(5);
	bt2.root.right = new TreeNode(3);
	bt2.root.right.left = new TreeNode(6);
	bt2.root.right.right = new TreeNode(7);

	assertFalse(bt.areSameStructure(bt1.root, bt2.root));

    }

}
