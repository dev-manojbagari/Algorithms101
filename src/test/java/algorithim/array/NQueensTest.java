package algorithim.array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NQueensTest {

    NQueens array;

    @Before
    public void setUp() throws Exception {
	array = new NQueens();
    }

    @Test
    public void test() {
	List<List<String>> expectead = Arrays.asList(Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
		Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
	List<List<String>> list = array.solveNQueens(4);

	assertEquals(expectead, list);

    }

    @Test
    public void test2() {
	List<List<String>> expectead = Arrays.asList(Arrays.asList("Q"));
	List<List<String>> list = array.solveNQueens(1);

	assertEquals(expectead, list);

    }

//    @Test
//    public void test() {
//	List<List<String>> expectead = Arrays.asList(Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
//		Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
//	int n = array.solveNQueens(8);
//
//	assertEquals(2, n);
//
//    }
//
//    @Test
//    public void test2() {
//	List<List<String>> expectead = Arrays.asList(Arrays.asList("Q"));
//	int n = array.solveNQueens(1);
//
//	assertEquals(1, n);
//
//    }
//
//    @Test
//    public void test3() {
//	List<List<String>> expectead = Arrays.asList(Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
//		Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
//	int n = array.solveNQueens(8);
//
//	assertEquals(92, n);
//
//    }

}
