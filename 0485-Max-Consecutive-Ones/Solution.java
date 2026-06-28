/*
 * LeetCode 485. Max Consecutive Ones
 * Difficulty: Easy
 * Tags: Array
 * URL: https://leetcode.com/problems/max-consecutive-ones/
 *
 * Approach:
 * Traverse the binary array and count consecutive 1s.
 * When a 0 is found, reset the current count to 0.
 * Keep updating maxcount with the largest streak seen so far.
 *
 * Example:
 * Input:  nums = [1, 1, 0, 1, 1, 1]
 * Output: 3
 *
 * Dry Run:
 * i = 0 -> 1 -> count = 1, maxcount = 1
 * i = 1 -> 1 -> count = 2, maxcount = 2
 * i = 2 -> 0 -> count = 0, maxcount = 2
 * i = 3 -> 1 -> count = 1, maxcount = 2
 * i = 4 -> 1 -> count = 2, maxcount = 2
 * i = 5 -> 1 -> count = 3, maxcount = 3
 *
 * Revision Notes:
 * - count tracks the current streak of consecutive 1s.
 * - maxcount stores the best streak found so far.
 * - Reset count whenever nums[i] is 0.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */     
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else if (nums[i] != 1) {
                count = 0;
            }

            maxcount = Math.max(maxcount, count);
        }

        return maxcount;
    }
}
            