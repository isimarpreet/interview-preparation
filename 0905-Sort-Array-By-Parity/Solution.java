/*
 * LeetCode 905. Sort Array By Parity
 * Difficulty: Easy
 * Tags: Array, Two Pointers, Sorting
 * URL: https://leetcode.com/problems/sort-array-by-parity/
 *
 * Approach:
 * Use two pointers: i at the start and j at the end.
 * Move i forward when nums[i] is even.
 * If nums[i] is odd and nums[j] is even, swap them.
 * If nums[j] is odd, move j backward.
 *
 * Example:
 * Input:  nums = [3, 1, 2, 4]
 * Output: [4, 2, 1, 3]
 *
 * Dry Run:
 * Start: [3, 1, 2, 4], i = 0, j = 3
 * nums[i] = 3 odd, nums[j] = 4 even -> swap -> [4, 1, 2, 3], i = 1, j = 2
 * nums[i] = 1 odd, nums[j] = 2 even -> swap -> [4, 2, 1, 3], i = 2, j = 1
 * Stop because i > j.
 *
 * Revision Notes:
 * - Even numbers should be moved toward the left side.
 * - Odd numbers naturally move toward the right side after swaps.
 * - Any valid even-before-odd ordering is accepted.
 * - The array is rearranged in-place.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 == 0) {
                swap(nums, i, j);
                j--;
                i++;
            } else {
                j--;
            }
        }

        return nums;
    }

    static void swap(int[] nums, int i, int j) {
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
    }
}
