package algorithim.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTFindAllDupSubTest {

    BTFindAllDupSub bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTFindAllDupSub();
    }

    @Test
    public void test() {

	bt.root = BTUtil.convert("1 2 3 4 -1 2 4 -1 -1 4 -1 -1 -1 -1 -1");
	List<Integer> list = Arrays.asList(2, 4);
	assertTrue(list.containsAll(bt.findDuplicateSubtrees(bt.root)));

    }

    @Test
    public void test2() {
	bt.root = BTUtil.convert("1 5 9 3 3 -1 -1 -1 -1 -1 -1");
	List<Integer> list = Arrays.asList(3);
	assertTrue(list.containsAll(bt.findDuplicateSubtrees(bt.root)));
    }

    @Test
    public void test3() {
	bt.root = BTUtil.convert("0,0,0,0,null,null,0,null,null,null,0");
	List<Integer> list = Arrays.asList(0);
	assertEquals(list, bt.findDuplicateSubtrees(bt.root));
    }

    @Test
    public void test4() {
	bt.root = BTUtil.convert("10,2,22,1,12,1,1");
	List<Integer> list = Arrays.asList(1);
	assertEquals(list, bt.findDuplicateSubtrees(bt.root));
    }

}
