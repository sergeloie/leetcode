package matrix;

/*
https://leetcode.com/problems/matrix-diagonal-sum/description/
1572. Matrix Diagonal Sum
Easy

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.



Example 1:

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:

Input: mat = [[5]]
Output: 5

 */

public class MatrixDiagonalSum_1572 {
    public int diagonalSum(int[][] mat) {
        int lastIndex = mat.length - 1;
        int result = 0;

        for (int i = 0; i <= lastIndex; i++) {
            result += mat[i][i];
            result += mat[i][lastIndex - i];
        }

        return mat.length % 2 == 0
                ? result
                : result - mat[lastIndex / 2][lastIndex / 2];
    }
}
