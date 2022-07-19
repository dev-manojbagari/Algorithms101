package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTLargestBSTTest {

    BTLargestBST bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTLargestBST();
    }

    @Test
    public void test() {

	String str = "0,2,9,null,null,8,1,-1,null,null,4,-5,2,null,1,null,-3,1,3,3,0";
	bt.root = BTLeetCodeArrayFormatToBT.convert(str);

	assertEquals(7, bt.largestBST(bt.root));

    }

    @Test
    public void test2() {

	String str = "9,2,3,null,2,null,null,3,null,-5,4,null,1,null,10";
	bt.root = BTLeetCodeArrayFormatToBT.convert(str);

	assertEquals(5, bt.largestBST(bt.root));

    }

}
