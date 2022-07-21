package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTDistanceFromRootTest {

    BTDistanceFromRoot bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTDistanceFromRoot();
    }

    @Test
    public void test() {
	bt.root = new TreeNode(50);
	bt.root.left = new TreeNode(30);
	bt.root.left.left = new TreeNode(20);
	bt.root.left.right = new TreeNode(40);

	bt.root.right = new TreeNode(70);
	bt.root.right.left = new TreeNode(60);
	bt.root.right.right = new TreeNode(80);

	assertEquals(2, bt.distanceFromRoot(bt.root, 20));
	assertEquals(0, bt.distanceFromRoot(bt.root, 50));
	assertEquals(1, bt.distanceFromRoot(bt.root, 30));

    }

}
