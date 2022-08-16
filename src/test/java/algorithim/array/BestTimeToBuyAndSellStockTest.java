package algorithim.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock array;

    @Before
    public void setUp() throws Exception {
	array = new BestTimeToBuyAndSellStock();
    }

    @Test
    public void test() {
	int[] prices = { 7, 1, 5, 3, 6, 4 };

	Assert.assertEquals(5, array.maxProfit(prices));

    }

}
