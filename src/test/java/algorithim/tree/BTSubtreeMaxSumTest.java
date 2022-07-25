package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTSubtreeMaxSumTest {

    BTSubtreeMaxSum bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTSubtreeMaxSum();
    }

    @Test
    public void test() {
	bt.root = BTUtil.convert("1 -2 3 4 7 -9 2 -1 -1 -1 -1 -1 -1 -1 -1");
	assertEquals(9, bt.maxSubtreeSum(bt.root));
    }

    @Test
    public void test2() {
	bt.root = BTUtil.convert("1 2 3 -1 -1 -1 -1");
	assertEquals(6, bt.maxSubtreeSum(bt.root));
    }

    @Test
    public void test3() {
	bt.root = BTUtil.convert("4 -3 -1 -1 -1");
	assertEquals(1, bt.maxSubtreeSum(bt.root));
    }

    @Test
    public void test4() {
	bt.root = BTUtil.convert("-2 -4 1 -5 -1 -1 -1 -1 -1");
	assertEquals(1, bt.maxSubtreeSum(bt.root));
    }

    @Test
    public void test5() {
	bt.root = BTUtil.convert("-10 8 11 -1 -1 -1 -1 -1 -1 -1 -1");
	assertEquals(11, bt.maxSubtreeSum(bt.root));
    }

}
