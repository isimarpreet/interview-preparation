/*
 * LeetCode 66. Plus One
 * Difficulty: Easy
 * Tags: Array, Math
 * URL: https://leetcode.com/problems/plus-one/
 *
 * Approach:
 * Traverse the array from the last digit towards the first.
 * If the current digit is less than 9, increment it by one and return the array.
 * If the digit is 9, set it to 0 and continue checking the previous digit.
 * If all digits are 9, create a new array with one extra digit and set the
 * first element to 1.
 *
 * Example:
 * Input:  digits = [1,2,3]
 * Output: [1,2,4]
 *
 * Dry Run:
 * Example: digits = [9,9,9]
 *
 * Start from the last digit:
 * 9 -> 0
 * 9 -> 0
 * 9 -> 0
 *
 * All digits became 0.
 * Create a new array of size n + 1.
 * Set ans[0] = 1.
 *
 * Result: [1,0,0,0]
 *
 * Revision Notes:
 * - Traverse the array from right to left.
 * - If a digit is less than 9, increment it and return immediately.
 * - If a digit is 9, change it to 0 and continue.
 * - If all digits are 9, create a new array with a leading 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * (O(n) only when a new array is created)
 */

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // Check if the digit is less than 9.
            // Increment it and return the updated array.
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, change it to 0
            // and continue to the previous digit.
            digits[i] = 0;
        }

        // If every digit was 9,
        // create a new array with one extra digit.
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}