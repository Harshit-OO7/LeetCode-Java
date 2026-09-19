/*
 * LeetCode 35 - Search Insert Position
 * Difficulty: Easy
 *
 * Topics: Array, Binary Search
 *
 * URL:
 * https://leetcode.com/problems/search-insert-position/
 *
 * Status: Accepted
 * Runtime: 0 ms | Memory: 44.7 MB
 *
 * Example:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 */

import java.util.*;

class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        return search(nums,target,0,nums.length-1);
    }
        public int search(int[] nums,int target, int low, int high)
        {
            if(low>high)
                return low;
            int mid = low+(high-low)/2;
            if(target == nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                return search(nums,target,mid+1,high);
            }
            else
            {
                return search(nums,target,low,mid-1);
            }
        }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        Solution solution = new Solution();

        int result = solution.searchInsert(nums, target);

        System.out.println("Output: " + result);
        System.out.println("Expected: " + "2");
    }
}
