package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTAreMirrorTest {

    BTAreMirror bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTAreMirror();

    }

    @Test
    public void test1() {

	BTAreMirror bt1 = new BTAreMirror();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(3);
	bt1.root.right = new TreeNode(2);

	BTAreMirror bt2 = new BTAreMirror();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(2);
	bt2.root.right = new TreeNode(3);

	assertTrue(bt.areMirror(bt1.root, bt2.root));

    }

    @Test
    public void test2() {

	BTAreMirror bt1 = new BTAreMirror();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(2);
	bt1.root.left.left = new TreeNode(4);
	bt1.root.left.right = new TreeNode(5);
	bt1.root.right = new TreeNode(3);
	bt1.root.right.left = new TreeNode(6);

	BTAreMirror bt2 = new BTAreMirror();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(2);
	bt2.root.left.left = new TreeNode(4);
	bt2.root.left.right = new TreeNode(5);
	bt2.root.right = new TreeNode(3);
	bt2.root.right.left = new TreeNode(6);

	assertFalse(bt.areMirror(bt1.root, bt2.root));

    }

}
