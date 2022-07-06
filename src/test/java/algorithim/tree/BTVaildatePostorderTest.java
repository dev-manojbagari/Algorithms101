package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTVaildatePostorderTest {

    BTVaildatePostorder bst;
    int[] post1 = { 2, 3, 4 };
    int[] post2 = { 1, 4, 2 };
    int[] post3 = { 1, 3, 4, 2, 7, 6, 5 };
    int[] post4 = { 1, 3, 4, 6, 7, 2, 5 };

    @Before
    public void setUp() throws Exception {
	bst = new BTVaildatePostorder();

    }

    @Test
    public void btVaildatePostorderRecursiveTest() {

	assertTrue(bst.vaildatePostOrderRecursive(post1));

	assertTrue(bst.vaildatePostOrderRecursive(post2));

	assertTrue(bst.vaildatePostOrderRecursive(post3));

	assertFalse(bst.vaildatePostOrderRecursive(post4));

    }

    @Test
    public void btVaildatePostorderRecursiveMinMaxTest() {

	assertTrue(bst.vaildatePostOrderRecursiveMinMax(post1));

	assertTrue(bst.vaildatePostOrderRecursiveMinMax(post2));

	assertTrue(bst.vaildatePostOrderRecursiveMinMax(post3));

	assertFalse(bst.vaildatePostOrderRecursiveMinMax(post4));

    }

    @Test
    public void btVaildatePostorderIterativeTest() {

	assertTrue(bst.vaildatePostOrderIterative(post1));

	assertTrue(bst.vaildatePostOrderIterative(post2));

	assertTrue(bst.vaildatePostOrderIterative(post3));

	assertFalse(bst.vaildatePostOrderIterative(post4));

    }
}
