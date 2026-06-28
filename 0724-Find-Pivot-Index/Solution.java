/*
 * LeetCode 724. Find Pivot Index
 * Difficulty: Easy
 * Tags: Array, Prefix Sum
 * URL: https://leetcode.com/problems/find-pivot-index/
 *
 * Approach:
 * First calculate the total sum of the array.
 * Then scan from left to right while maintaining the left sum.
 * For each index, remove nums[i] from total sum so the remaining sum becomes
 * the right sum. If left sum equals right sum, return that index.
 *
 * Example:
 * Input:  nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 *
 * Dry Run:
 * total sum = 28, left sum = 0
 * i = 0 -> right sum = 27, left sum = 0  -> not equal, left sum = 1
 * i = 1 -> right sum = 20, left sum = 1  -> not equal, left sum = 8
 * i = 2 -> right sum = 17, left sum = 8  -> not equal, left sum = 11
 * i = 3 -> right sum = 11, left sum = 11 -> pivot index found
 *
 * Revision Notes:
 * - Total sum helps calculate the right side without another loop each time.
 * - Subtract nums[i] before comparing, because pivot element is not included.
 * - Return the first matching index because the problem asks for the leftmost pivot.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int lsum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];

            if (lsum == sum) {
                return i;
            } else {
                lsum = lsum + nums[i];
            }
        }

        return -1;
    }
}
