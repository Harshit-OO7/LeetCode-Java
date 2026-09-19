/*
 * LeetCode 33 - Search in Rotated Sorted Array
 * Difficulty: Medium
 *
 * Topics: Array, Binary Search
 *
 * URL:
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * Status: Accepted
 * Runtime: 0 ms | Memory: 43.9 MB
 *
 * Example:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 */

import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
        int left  = 0;
        int right = nums.length-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[left]<=nums[mid])
            {
                if(nums[left]<=target && target<nums[mid]) 
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
            else
            {
                if(nums[mid]<target && target<=nums[right])
                {
                    left = mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        Solution solution = new Solution();

        int result = solution.search(nums, target);

        System.out.println("Output: " + result);
        System.out.println("Expected: " + "4");
    }
}
