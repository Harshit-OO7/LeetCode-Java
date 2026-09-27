/*
 * LeetCode 14 - Longest Common Prefix
 * Difficulty: Easy
 *
 * Topics: Array, String, Trie
 *
 * URL:
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * Status: Accepted
 * Runtime: N/A | Memory: N/A
 *
 * Example:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */

import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int i,j,k,l,count=0;
        String ans ="";
        for(j=0;j<strs[0].length();j++)
        {
            for(i=0;i<strs.length-1;i++)
            {
                if(j >= strs[i+1].length())
                {
                        return ans;
                }
                if(strs[i].charAt(j) == strs[i+1].charAt(j))
                {
                    continue;
                }
                else
                {
                    return ans;
                }
            }
            ans = ans + strs[i].charAt(j);
         }
         return ans;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        Solution solution = new Solution();

        String result = solution.longestCommonPrefix(strs);

        System.out.println("Output: " + result);
        System.out.println("Expected: " + "\"fl\"");
    }
}

// Runner class matching filename for Code Runner execution
class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution.main(args);
    }
}
