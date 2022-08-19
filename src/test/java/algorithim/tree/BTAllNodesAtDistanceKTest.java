package algorithim.tree;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTAllNodesAtDistanceKTest {

    BTAllNodesAtDistanceK bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTAllNodesAtDistanceK();
    }

    @Test
    public void test() {

	bt.root = BTUtil.convert("3 5 1 6 2 0 8 -1 -1 7 4 -1 -1 -1 -1 -1 -1 -1 -1");
	List<Integer> list = bt.distanceK(bt.root, bt.root.left, 2);

	assertTrue(list.containsAll(Arrays.asList(1, 4, 7)));

    }

    @Test
    public void test2() {

	bt.root = BTUtil.convert("1 2 3 4 5 -1 -1 6 -1 -1 -1 -1 -1");
	List<Integer> list = bt.distanceK(bt.root, bt.root.left.right, 3);

	assertTrue(list.containsAll(Arrays.asList(3, 6)));
    }

    @Test
    public void test3() {

	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);

	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(4);
	bt.root.right.left.left = new TreeNode(5);
	bt.root.right.right = new TreeNode(6);

	bt.root.right.right.left = new TreeNode(7);
	List<Integer> list = bt.distanceK(bt.root, bt.root.left, 2);

	assertTrue(list.containsAll(Arrays.asList(3)));

    }

}
