/*
 * LeetCode 941. Valid Mountain Array
 * Difficulty: Easy
 * Tags: Array, Two Pointers
 * URL: https://leetcode.com/problems/valid-mountain-array/
 *
 * Approach:
 * Use two pointers.
 * Move the left pointer upward while the sequence is increasing.
 * Move the right pointer downward while the sequence is decreasing.
 * The array is a valid mountain only if both pointers meet at the same peak,
 * and the peak is neither the first nor the last element.
 *
 * Example:
 * Input: arr = [0,3,2,1]
 * Output: true
 *
 * Dry Run:
 * Left pointer:
 * 0 -> 3 (move)
 * stop at index 1
 *
 * Right pointer:
 * 1 <- 2 <- 3
 * stop at index 1
 *
 * Both pointers meet at index 1.
 * Return true.
 *
 * Revision Notes:
 * - Array length must be at least 3.
 * - Peak cannot be the first element.
 * - Peak cannot be the last element.
 * - Increasing and decreasing parts must both exist.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean validMountainArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        if (arr.length < 3) {
            return false;
        }

        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }

        return i > 0 && j < arr.length - 1 && i == j;
    }
}