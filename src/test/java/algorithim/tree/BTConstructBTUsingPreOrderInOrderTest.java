package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTConstructBTUsingPreOrderInOrderTest {

    BTConstructBTUsingPreOrderInOrder bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTConstructBTUsingPreOrderInOrder();
    }

    @Test
    public void test() {
	int in[] = { 4, 2, 5, 1, 6, 3, 7 };
	int pre[] = { 1, 2, 4, 5, 3, 6, 7 };

	bt.root = bt.buildTree(pre, in);
	assertEquals("1 2 3 4 5 6 7", BTUtil.convert(bt.root));

    }

}
