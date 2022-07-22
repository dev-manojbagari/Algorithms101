package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTDistanceBetweenNodesTest {

    BTDistanceBetweenNodes bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTDistanceBetweenNodes();
    }

    @Test
    public void test() {
	bt.root = BTUtil.convert("5 6 2 4 3 -1 -1 9 7 -1 -1 -1 -1 -1 -1");
	int distance = bt.findDistance(bt.root, 5, 9);
	assertEquals(3, distance);
    }

    @Test
    public void test2() {
	bt.root = BTUtil.convert("1 2 -1 3 -1 -1 -1");
	int distance = bt.findDistance(bt.root, 3, 1);
	assertEquals(2, distance);
    }

}
