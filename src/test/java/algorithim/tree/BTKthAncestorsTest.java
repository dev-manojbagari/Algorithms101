package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTKthAncestorsTest {

    BTKthAncestors bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTKthAncestors();
    }

    @Test
    public void test() {
	bt.root = BTUtil.convert("19 17 32 11 -1 -1 -1 25 -1 -1 -1");
	assertEquals(19, bt.kthAncestors(bt.root, 11, 2));
    }

    @Test
    public void test2() {
	bt.root = BTUtil.convert("15 2 6 9 8 27 11 -1 -1 -1 -1 -1 -1 -1 -1");
	assertEquals(15, bt.kthAncestors(bt.root, 9, 2));
    }

    @Test
    public void test3() {
	bt.root = BTUtil.convert("1 3 5 4 -1 -1 -1 -1 -1");
	assertEquals(1, bt.kthAncestors(bt.root, 4, 2));
    }

    @Test
    public void test4() {
	bt.root = BTUtil.convert("17 25 99 54 61 11 -1 -1 -1 -1 -1 -1 -1");
	assertEquals(17, bt.kthAncestors(bt.root, 11, 2));
    }

}
