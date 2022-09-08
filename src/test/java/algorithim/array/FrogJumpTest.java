package algorithim.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FrogJumpTest {

    FrogJump array;

    @Before
    public void setUp() throws Exception {
	array = new FrogJump();
    }

    @Test
    public void test() {
	int arr[] = { 4, 8, 3, 10, 4, 4 };
	assertEquals(2, FrogJump.frogJump(arr.length, arr));
    }

}
