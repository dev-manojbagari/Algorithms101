package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTDeleteNodeRootToLeafPathSumLessThanTest {

    BTDeleteNodeRootToLeafSumLessThan bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTDeleteNodeRootToLeafSumLessThan();

    }

    @Test
    public void btDeleteNodeRootToLeafSumLessThanTest2() {

	bt.root = BTUtil.convert("1,2,-3,-5,null,4,null");

	bt.bstDeleteNodeRootToLeadPathSumLessThan(bt.root, -1);
	assertEquals("1 -3 4", BTUtil.convert(bt.root));

    }

}
