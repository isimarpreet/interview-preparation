/*
 * LeetCode 121. Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Tags: Array, Dynamic Programming
 * URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Approach:
 * Keep track of the minimum stock price seen so far.
 * For each day, calculate the profit if selling on that day.
 * Update the maximum profit whenever a better profit is found.
 *
 * Example:
 * Input:  prices = [7, 1, 5, 3, 6, 4]
 * Output: 5
 *
 * Dry Run:
 * min_price = 7, maxprofit = 0
 * price = 1 -> update min_price = 1, profit = 0, maxprofit = 0
 * price = 5 -> profit = 4, maxprofit = 4
 * price = 3 -> profit = 2, maxprofit = 4
 * price = 6 -> profit = 5, maxprofit = 5
 * price = 4 -> profit = 3, maxprofit = 5
 *
 * Revision Notes:
 * - Always buy before selling, so scan prices from left to right.
 * - min_price stores the best buying price before the current day.
 * - maxprofit stores the best sell profit found so far.
 * - If prices keep decreasing, maxprofit remains 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxprofit = 0;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }

            profit = prices[i] - min_price;

            if (profit > maxprofit) {
                maxprofit = profit;
            }
        }

        return maxprofit;
    }
}
