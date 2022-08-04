package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTUtilTest {

    BTUtil bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTUtil();
    }

    @Test
    public void test() {

	String arr = "9,2,3,null,2,null,null,3,null,-5,4,null,1,null,10";
	bt.root = BTUtil.convert(arr);
	assertEquals("[9, 2, 3, 2, 3, -5, 4, 1, 10]", BTUtil.convert(bt.root));

    }

    @Test
    public void test2() {

	String arr = "1 2 3 4 5 -1 -1 6 -1 -1 -1 -1 -1";
	bt.root = BTUtil.convert(arr);
	assertEquals("[1, 2, 3, 4, 5, 6]", BTUtil.convert(bt.root));

    }

}
