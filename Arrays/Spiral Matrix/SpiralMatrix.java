/*
 * LeetCode 54 - Spiral Matrix
 * Difficulty: Medium
 *
 * Topics: Array, Matrix, Simulation
 *
 * URL:
 * https://leetcode.com/problems/spiral-matrix/
 *
 * Status: Accepted
 * Runtime: N/A | Memory: N/A
 *
 * Example:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 */

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int colBegin = 0;
        int colEnd = matrix[0].length-1;
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int j;
        List<Integer> res = new ArrayList<>();

        while(colBegin<=colEnd && rowBegin<=rowEnd)
        {
            for(j=colBegin;j<=colEnd;j++)
            {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            for(j=rowBegin;j<=rowEnd;j++)
            {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if (rowBegin<=rowEnd) 
            {
                for(j=colEnd;j>=colBegin;j--)
                {
                    res.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }
            if(colBegin<=colEnd)
            {
                for(j=rowEnd;j>=rowBegin;j--)
                {
                    res.add(matrix[j][colBegin]);
                }
                colBegin++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        Solution solution = new Solution();

        List<Integer> result = solution.spiralOrder(matrix);

        System.out.println("Output: " + result);
        System.out.println("Expected: " + "[1,2,3,6,9,8,7,4,5]");
    }
}
