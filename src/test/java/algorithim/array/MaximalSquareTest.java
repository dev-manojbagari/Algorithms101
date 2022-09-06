package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaximalSquareTest {
    MaximalSquare array;

    @Before
    public void setUp() throws Exception {
	array = new MaximalSquare();
    }

    @Test
    public void test() {
	char[][] x = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
		{ '1', '0', '0', '1', '1', } };
	int area = array.maximalSquare(x);

	assertEquals(4, area);

    }

}
