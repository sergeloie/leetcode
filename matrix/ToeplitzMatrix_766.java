package matrix;

/*
https://leetcode.com/problems/toeplitz-matrix/description/
766. Toeplitz Matrix
Easy

Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.



Example 1:

Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.

Example 2:

Input: matrix = [[1,2],[2,2]]
Output: false
Explanation:
The diagonal "[1, 2]" has different elements.

 */

public class ToeplitzMatrix_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        final int lastRowIndex = matrix.length - 1;
        final int lastColumnIndex = matrix[0].length - 1;
//        С нижней строки пойдём вверх, до главной диагонали
        for (int i = lastRowIndex; i >= 0 ; i--) {
            int row = i;
            int column = 0;
            int controlNumber = matrix[row][column];
            while (row <= lastRowIndex && column <= lastColumnIndex) {
                if (matrix[row][column] != controlNumber) {
                    return false;
                }
                row++;
                column++;
            }
        }
//        С последнего столбца пойдём влево, до главной диагонали
        for (int i = lastColumnIndex; i >= 0 ; i--) {
            int row = 0;
            int column = i;
            int controlNumber = matrix[row][column];
            while (row <= lastRowIndex && column <= lastColumnIndex) {
                if (matrix[row][column] != controlNumber) {
                    return false;
                }
                row++;
                column++;
            }
        }
        return true;
    }
}
