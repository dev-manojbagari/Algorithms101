package algorithim.tree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTAreIsomorphicTest {

    BTAreIsomorphic bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTAreIsomorphic();

    }

    @Test
    public void test1() {

	BTAreIsomorphic bt1 = new BTAreIsomorphic();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(3);
	bt1.root.right = new TreeNode(2);

	BTAreIsomorphic bt2 = new BTAreIsomorphic();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(2);
	bt2.root.right = new TreeNode(3);

	assertTrue(bt.areIsomorphic(bt1.root, bt2.root));

    }

    @Test
    public void test2() {

	BTAreIsomorphic bt1 = new BTAreIsomorphic();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(3);
	bt1.root.right = new TreeNode(2);

	BTAreIsomorphic bt2 = new BTAreIsomorphic();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(3);
	bt2.root.right = new TreeNode(2);

	assertTrue(bt.areIsomorphic(bt1.root, bt2.root));

    }

}
