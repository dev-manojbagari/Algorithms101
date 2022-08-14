package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTCountGoodNodesTest {

    BTCountGoodNodes bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTCountGoodNodes();
    }

    // []

    @Test
    public void test() {
	bt.root = BTUtil.convert("3,1,4,3,null,1,5");
	int count = bt.goodNodes(bt.root);

	assertEquals(4, count);
    }

}
