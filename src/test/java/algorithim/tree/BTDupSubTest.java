package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTDupSubTest {

    BTDupSub bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTDupSub();
    }

    @Test
    public void test() {
	bt.root = BTUtil.convert("1 2 1 3 -1 2 -1 -1 -1 3 -1 -1");
	assertTrue(bt.dupST(bt.root));
    }
    // a a # a # a # a # a # # #

    @Test
    public void test2() {
	bt.root = BTUtil.convert("1 1 -1 1 -1 1 -1 1 -1 1 -1 -1 -1");
	assertFalse(bt.dupST(bt.root));
    }

}
