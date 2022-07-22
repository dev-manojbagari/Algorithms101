package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTMaxSumNonAdjacentTest {

    BTMaxSumNonAdjacent bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTMaxSumNonAdjacent();
    }

    @Test
    public void test() {

	String str = "1, 2, 3, 1,null,4,5,null,null,null,null,null,null";
	bt.root = BTUtil.leetcodeConvert(str);
	assertEquals(11, bt.maxSumNonAdj(bt.root));
    }

    @Test
    public void test2() {

	String str = "1,2,3,null,null,null,null";
	bt.root = BTUtil.leetcodeConvert(str);
	assertEquals(5, bt.maxSumNonAdj(bt.root));
    }

    @Test
    public void test3() {

	String str1 = "1 2 3 4 -1 5 6 -1 7 -1 -1 -1 -1 -1 -1";
	bt.root = BTUtil.convert(str1);
	assertEquals(20, bt.maxSumNonAdj(bt.root));
    }

    // 1 2 3 4 -1 5 6 -1 7 -1 -1 -1 -1 -1 -1
    //

}
