package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTVaildatePostorderTest {

    BTVaildatePostorder bst;

    @Before
    public void setUp() throws Exception {
	bst = new BTVaildatePostorder();

    }

    @Test
    public void btVaildatePostorderRecursiveTest() {

	int[] pre1 = { 2, 3, 4 };

	assertTrue(bst.vaildatePostOrderRecursive(pre1));

	int[] pre2 = { 1, 4, 2 };
	assertTrue(bst.vaildatePostOrderRecursive(pre2));

	int[] pre3 = { 1, 3, 4, 2, 7, 6, 5 };
	assertTrue(bst.vaildatePostOrderRecursive(pre3));

	int[] pre4 = { 1, 3, 4, 6, 7, 2, 5 };
	assertFalse(bst.vaildatePostOrderRecursive(pre4));

    }

    @Test
    public void btVaildatePostorderRecursiveMinMaxTest() {

	int[] pre1 = { 2, 3, 4 };

	assertTrue(bst.vaildatePostOrderRecursiveMinMax(pre1));

	int[] pre2 = { 1, 4, 2 };
	assertTrue(bst.vaildatePostOrderRecursiveMinMax(pre2));

	int[] pre3 = { 1, 3, 4, 2, 7, 6, 5 };
	assertTrue(bst.vaildatePostOrderRecursiveMinMax(pre3));

	int[] pre4 = { 1, 3, 4, 6, 7, 2, 5 };
	assertFalse(bst.vaildatePostOrderRecursiveMinMax(pre4));

    }

    @Test
    public void btVaildatePostorderIterativeTest() {

	int[] pre1 = { 2, 3, 4 };

	assertTrue(bst.vaildatePostOrderIterative(pre1));

	int[] pre2 = { 1, 4, 2 };
	assertTrue(bst.vaildatePostOrderIterative(pre2));

	int[] pre3 = { 1, 3, 4, 2, 7, 6, 5 };
	assertTrue(bst.vaildatePostOrderIterative(pre3));

	int[] pre4 = { 1, 3, 4, 6, 7, 2, 5 };
	assertFalse(bst.vaildatePostOrderIterative(pre4));

    }
}
