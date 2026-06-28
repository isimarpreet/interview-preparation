/*
 * LeetCode 747. Largest Number At Least Twice of Others
 * Difficulty: Easy
 * Tags: Array
 * URL: https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 *
 * Approach:
 * First, find the maximum element and its index.
 * Then compare the maximum element with every other element.
 * If the maximum is less than twice any other element,
 * return -1.
 * Otherwise, return the index of the maximum element.
 *
 * Example:
 * Input: nums = [3,6,1,0]
 * Output: 1
 *
 * Dry Run:
 * Maximum = 6
 * Index = 1
 *
 * Compare:
 * 6 >= 2*3
 * 6 >= 2*1
 * 6 >= 2*0
 *
 * All conditions satisfied.
 * Return 1.
 *
 * Revision Notes:
 * - First pass finds the largest element.
 * - Second pass validates the condition.
 * - Ignore comparison with the largest element itself.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int dominantIndex(int[] nums) {

        int maxIndex = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (i == maxIndex) {
                continue;
            }

            if (max < 2 * nums[i]) {
                return -1;
            }

        }

        return maxIndex;
    }
}