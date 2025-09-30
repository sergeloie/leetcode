package array;

public class FinalPricesWithASpecialDiscountInAShop_1475 {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int index = findFirstIndexLessThanValue(prices, i);
            if (index > 0) {
                result[i] = prices[i] - prices[index];
            } else {
                result[i] = prices[i];
            }
        }
        return result;
    }

    private int findFirstIndexLessThanValue(int[] prices, int startIndex) {
        for (int i = startIndex + 1; i < prices.length; i++) {
            if (prices[i] <= prices[startIndex]) {
                return i;
            }
        }
        return -1;
    }
}
