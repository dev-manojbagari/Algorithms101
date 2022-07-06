package algorithim.tree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTPrintLevelTest {

    BTPrintLevel bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTPrintLevel();
    }

    @Test
    public void btPrintLevelRecusive() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
	List<Integer> list2 = bt.printLevelRecusive(bt.root, 2);

	assertEquals(list1, list2);
    }

    @Test
    public void btPrintLevel() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
	List<Integer> list2 = bt.printLevelIter(bt.root, 2);

	assertEquals(list1, list2);
    }

}
