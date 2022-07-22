package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTLargestBSTSumTest {

    BTLargestBSTSum bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTLargestBSTSum();

    }

    @Test
    public void test() {
	bt.root = new TreeNode(4);
	bt.root.left = new TreeNode(3);
	bt.root.left.left = new TreeNode(1);
	bt.root.left.right = new TreeNode(2);

	assertEquals(2, bt.maxSumBST(bt.root));
    }

    @Test
    public void test2() {
	bt.root = new TreeNode(5);
	bt.root.left = new TreeNode(4);
	bt.root.right = new TreeNode(8);

	bt.root.left.left = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(3);

	assertEquals(7, bt.maxSumBST(bt.root));
    }

    @Test
    public void test3() {
	bt.root = new TreeNode(4);
	bt.root.left = new TreeNode(8);
	bt.root.left.left = new TreeNode(6);
	bt.root.left.left.left = new TreeNode(9);
	;
	bt.root.left.right = new TreeNode(1);
	bt.root.left.right.left = new TreeNode(-5);
	bt.root.left.right.right = new TreeNode(4);
	bt.root.left.right.left.right = new TreeNode(-3);
	bt.root.left.right.right.right = new TreeNode(10);

	assertEquals(14, bt.maxSumBST(bt.root));
    }

    @Test
    public void test4() {
	String str = "9,2,3,null,2,null,null,3,null,-5,4,null,1,null,10";

	bt.root = BinaryTreeUtil.leetcodeConvert(str);
	assertEquals(14, bt.maxSumBST(bt.root));

    }

    @Test
    public void test5() {
	String str = "0,2,9,null,null,8,1,-1,null,null,4,-5,2,null,1,null,-3,1,3,3,0";

	bt.root = BinaryTreeUtil.leetcodeConvert(str);
	assertEquals(6, bt.maxSumBST(bt.root));

    }
}
