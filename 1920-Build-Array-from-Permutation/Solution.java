/*
 * LeetCode 1920. Build Array from Permutation
 * Difficulty: Easy
 * Tags: Array, Simulation
 * URL: https://leetcode.com/problems/build-array-from-permutation/
 *
 * Approach:
 * Create a new array ans of the same length as nums.
 * For every index i, store nums[nums[i]] in ans[i].
 *
 * Example:
 * Input:  nums = [0, 2, 1, 5, 3, 4]
 * Output: [0, 1, 2, 4, 5, 3]
 *
 * Dry Run:
 * i = 0 -> ans[0] = nums[nums[0]] = nums[0] = 0
 * i = 1 -> ans[1] = nums[nums[1]] = nums[2] = 1
 * i = 2 -> ans[2] = nums[nums[2]] = nums[1] = 2
 * i = 3 -> ans[3] = nums[nums[3]] = nums[5] = 4
 * i = 4 -> ans[4] = nums[nums[4]] = nums[3] = 5
 * i = 5 -> ans[5] = nums[nums[5]] = nums[4] = 3
 *
 * Revision Notes:
 * - The problem directly asks for ans[i] = nums[nums[i]].
 * - Since nums is a permutation, nums[i] is always a valid index.
 * - A new array keeps the original nums unchanged while building the answer.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
