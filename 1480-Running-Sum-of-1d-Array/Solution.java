/*
 * LeetCode 1480. Running Sum of 1d Array
 * Difficulty: Easy
 * Tags: Array, Prefix Sum
 * URL: https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Approach:
 * Convert the given array into its running sum in-place.
 * For every index i from 1 to n - 1, add the previous prefix value nums[i - 1]
 * to the current value nums[i]. After this, nums[i] stores the sum from
 * nums[0] to nums[i].
 *
 * Example:
 * Input:  nums = [1, 2, 3, 4]
 * Output: [1, 3, 6, 10]
 *
 * Dry Run:
 * Start: [1, 2, 3, 4]
 * i = 1 -> nums[1] = nums[1] + nums[0] = 2 + 1 = 3  -> [1, 3, 3, 4]
 * i = 2 -> nums[2] = nums[2] + nums[1] = 3 + 3 = 6  -> [1, 3, 6, 4]
 * i = 3 -> nums[3] = nums[3] + nums[2] = 4 + 6 = 10 -> [1, 3, 6, 10]
 *
 * Revision Notes:
 * - Start from index 1 because index 0 is already its own running sum.
 * - The previous element already contains the prefix sum after each update.
 * - This solution modifies the input array directly.
 * - No extra array is needed.
 *
 * Time Complexity: O(n), where n is the length of nums.
 * Space Complexity: O(1), because the running sum is stored in the same array.
 */
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}
