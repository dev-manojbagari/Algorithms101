package algorithim.tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BSTSeralizeDeseralizeTest {

    BSTSeralizeDeseralize bst;

    @Before
    public void setUp() throws Exception {
	bst = new BSTSeralizeDeseralize();

    }

    @Test
    public void btSeralizeDeseralizeTest() {

	bst.root = new TreeNode(3);

	bst.root.left = new TreeNode(2);

	bst.root.right = new TreeNode(5);

	bst.root = bst.deSeralize(bst.seralize(bst.root));

	assertEquals(bst.root.value, 3);
	assertEquals(bst.root.left.value, 2);
	assertEquals(bst.root.right.value, 5);

    }

    @Test
    public void bstSeralizeTest() {

	bst.root = new TreeNode(3);

	bst.root.left = new TreeNode(2);

	bst.root.right = new TreeNode(5);

	String str = bst.seralize(bst.root);

	String expected = "3,2,5,";

	assertEquals(str, expected);

    }

    @Test
    public void btDeseralizeTest() {

	String str = "3,2,5,";

	bst.root = bst.deSeralize(str);

	assertEquals(bst.root.value, 3);
	assertEquals(bst.root.left.value, 2);
	assertEquals(bst.root.right.value, 5);

    }

}
