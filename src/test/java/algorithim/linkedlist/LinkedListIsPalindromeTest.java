package algorithim.linkedlist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedListIsPalindromeTest {

    LinkedListIsPalindrome list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListIsPalindrome();
    }

    @Test
    public void test0() {
	list.head = LLUtil.convert("1 2 3 4 5");

	assertFalse(list.isPalindrome(list.head));

    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 2 1");

	assertTrue(list.isPalindrome(list.head));

    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1 1");

	assertTrue(list.isPalindrome(list.head));

    }

    @Test
    public void test3() {
	list.head = LLUtil.convert("1");

	assertTrue(list.isPalindrome(list.head));

    }

    @Test
    public void test4() {
	list.head = LLUtil.convert("1 2 3 4 3 2 1");

	assertTrue(list.isPalindrome(list.head));

    }

    @Test
    public void test5() {
	list.head = LLUtil.convert("1 2 3 4 2 1");

	assertFalse(list.isPalindrome(list.head));

    }

}
