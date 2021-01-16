// Algorithm: Iterate over prices once while keeping track of minprice seen so far and maxprofit seen so far
// Running time: O(n) --> see every price exactly once
// Additional space: O(1) --> constants declared

class Solution {
    public int maxProfit(int[] prices) {
        
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else {
                maxprofit = Math.max(maxprofit, prices[i] - minprice);
            }
        }
        
        return maxprofit;
        
        
    }
}
