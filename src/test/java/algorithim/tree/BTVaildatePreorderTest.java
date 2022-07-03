package algorithim.tree;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTVaildatePreorderTest {

    BTVaildatePreorder bst;

    @Before
    public void setUp() throws Exception {
	bst = new BTVaildatePreorder();

    }

    @Test
    public void btVaildatePreorderRecursiveTest() {

	int[] pre1 = { 2, 4, 3 };

	assertTrue(bst.vaildatePreOrderRecursive(pre1));

	int[] pre2 = { 2, 4, 1 };
	assertFalse(bst.vaildatePreOrderRecursive(pre2));

	int[] pre3 = { 40, 30, 35, 80, 100 };
	assertTrue(bst.vaildatePreOrderRecursive(pre3));

	int[] pre4 = { 40, 30, 35, 20, 80, 100 };
	assertFalse(bst.vaildatePreOrderRecursive(pre4));

	int[] pre5 = { 6, 5, 4, 2, 1, 3, 8, 7, 10, 9, 11 };
	assertTrue(bst.vaildatePreOrderRecursive(pre5));

    }

    @Test
    public void btVaildatePreorderRecursiveMinMaxTest() {

	int[] pre1 = { 2, 4, 3 };

	assertTrue(bst.vaildatePreOrderRecursiveMinMax(pre1));

	int[] pre2 = { 2, 4, 1 };
	assertFalse(bst.vaildatePreOrderRecursiveMinMax(pre2));

	int[] pre3 = { 40, 30, 35, 80, 100 };
	assertTrue(bst.vaildatePreOrderRecursiveMinMax(pre3));

	int[] pre4 = { 40, 30, 35, 20, 80, 100 };
	assertFalse(bst.vaildatePreOrderRecursiveMinMax(pre4));

	int[] pre5 = { 6, 5, 4, 2, 1, 3, 8, 7, 10, 9, 11 };
	assertTrue(bst.vaildatePreOrderRecursiveMinMax(pre5));

    }

    @Test
    public void btVaildatePreorderIterativeTest() {

	int[] pre1 = { 2, 4, 3 };

	assertTrue(bst.vaildatePreOrderIterative(pre1));

	int[] pre2 = { 2, 4, 1 };
	assertFalse(bst.vaildatePreOrderIterative(pre2));

	int[] pre3 = { 40, 30, 35, 80, 100 };
	assertTrue(bst.vaildatePreOrderIterative(pre3));

	int[] pre4 = { 40, 30, 35, 20, 80, 100 };
	assertFalse(bst.vaildatePreOrderIterative(pre4));

	int[] pre5 = { 6, 5, 4, 2, 1, 3, 8, 7, 10, 9, 11 };
	assertTrue(bst.vaildatePreOrderIterative(pre5));

    }

}
