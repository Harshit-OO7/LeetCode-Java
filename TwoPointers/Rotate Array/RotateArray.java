/*
 * LeetCode 189 - Rotate Array
 * Difficulty: Medium
 *
 * Topics: Array, Math, Two Pointers
 *
 * URL:
 * https://leetcode.com/problems/rotate-array/
 *
 * Status: Accepted
 * Runtime: 1 ms | Memory: 55.8 MB
 *
 * Example:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 */

import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        Solution solution = new Solution();

        solution.rotate(nums, k);

        System.out.println("Output: " + Arrays.toString(nums));
        System.out.println("Expected: " + "[5,6,7,1,2,3,4]");
    }
}
