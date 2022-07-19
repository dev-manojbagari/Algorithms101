package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTLeetCodeArrayFormatToBTTest {

    BTLeetCodeArrayFormatToBT bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTLeetCodeArrayFormatToBT();
    }

    @Test
    public void test() {

	String arr = "9,2,3,null,2,null,null,3,null,-5,4,null,1,null,10";
	bt.root = bt.leetcodeConvert(arr);
	assertEquals("[9, 2, 3, 2, 3, -5, 4, 1, 10]", BTLeetCodeArrayFormatToBT.toString(bt.root).toString());

    }

}
