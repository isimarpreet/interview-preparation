/*
 * LeetCode 1295. Find Numbers with Even Number of Digits
 * Difficulty: Easy
 * Tags: Array, Math
 * URL: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Approach:
 * Traverse every number in nums.
 * Count its digits by repeatedly dividing it by 10.
 * If the digit count is even, increase the answer count.
 *
 * Example:
 * Input:  nums = [12, 345, 2, 6, 7896]
 * Output: 2
 *
 * Dry Run:
 * 12   -> digits = 2 -> even -> count = 1
 * 345  -> digits = 3 -> odd  -> count = 1
 * 2    -> digits = 1 -> odd  -> count = 1
 * 6    -> digits = 1 -> odd  -> count = 1
 * 7896 -> digits = 4 -> even -> count = 2
 *
 * Revision Notes:
 * - countdigits() extracts digits using division by 10.
 * - checkeven() returns true only when the digit count is divisible by 2.
 * - The final answer is the number of elements with an even digit count.
 *
 * Time Complexity: O(n * d), where d is the number of digits in a number.
 * Space Complexity: O(1)
 */
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (checkeven(nums[i])) {
                count++;
            }
        }

        return count;
    }

    static int countdigits(int nums) {
        int count = 0;

        while (nums > 0) {
            count++;
            nums = nums / 10;
        }

        return count;
    }

    static boolean checkeven(int nums) {
        int even = countdigits(nums);

        if (even % 2 == 0) {
            return true;
        }

        return false;
    }
}
