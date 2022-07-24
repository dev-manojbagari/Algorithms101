package algorithim.tree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTAncestorsTest {

    BTAncestors bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTAncestors();
    }

    @Test
    public void test() {
	bt.root = BTUtil.convert("19 17 32 11 -1 -1 -1 25 -1 -1 -1");
	List<Integer> list = Arrays.asList(17, 19);
	assertEquals(list, bt.ancestors(bt.root, 11));
    }

    @Test
    public void test2() {
	bt.root = BTUtil.convert("15 2 6 9 8 27 11 -1 -1 -1 -1 -1 -1 -1 -1");
	List<Integer> list = Arrays.asList(2, 15);
	assertEquals(list, bt.ancestors(bt.root, 9));
    }

    @Test
    public void test3() {
	bt.root = BTUtil.convert("1 3 5 4 -1 -1 -1 -1 -1");
	List<Integer> list = Arrays.asList(3, 1);
	assertEquals(list, bt.ancestors(bt.root, 4));
    }

    @Test
    public void test4() {
	bt.root = BTUtil.convert("17 25 99 54 61 11 -1 -1 -1 -1 -1 -1 -1");
	List<Integer> list = Arrays.asList(99, 17);
	assertEquals(list, bt.ancestors(bt.root, 11));
    }

}
