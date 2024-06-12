public class BuyAndSelll {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 3, 8, 1, 7}));
    }

    public static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxi = 0;
        int n = prices.length;
        while (r < n) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxi = Math.max(maxi, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxi;

    }
}
