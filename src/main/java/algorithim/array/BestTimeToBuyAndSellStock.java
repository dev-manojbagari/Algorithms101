package algorithim.array;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
	if (prices == null || prices.length == 1)
	    return 0;

	int minLeft = prices[0];
	int maxProfit = 0;
	for (int i = 1; i < prices.length; i++) {
	    if (prices[i] > minLeft) {
		maxProfit = Math.max(maxProfit, prices[i] - minLeft);
	    } else {
		minLeft = prices[i];
	    }
	}

	return maxProfit;
    }

}
