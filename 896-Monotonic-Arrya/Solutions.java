/*
 * LeetCode 896. Monotonic Array
 * Difficulty: Easy
 * Tags: Array
 * URL: https://leetcode.com/problems/monotonic-array/
 *
 * Approach:
 * Maintain two boolean flags:
 * - increasing checks whether the array never decreases.
 * - decreasing checks whether the array never increases.
 * Traverse the array once and update both flags.
 * If either flag remains true, the array is monotonic.
 *
 * Example:
 * Input: nums = [1,2,2,3]
 * Output: true
 *
 * Dry Run:
 * increasing = true
 * decreasing = true
 *
 * 1 <= 2 -> increasing stays true
 * 1 < 2 -> decreasing becomes false
 *
 * Continue traversal.
 * At the end:
 * increasing = true
 * decreasing = false
 *
 * Return true.
 *
 * Revision Notes:
 * - A monotonic array is either entirely non-decreasing or non-increasing.
 * - Maintain two flags simultaneously.
 * - Equal elements are allowed.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }

            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }

        return decreasing || increasing;
    }
}