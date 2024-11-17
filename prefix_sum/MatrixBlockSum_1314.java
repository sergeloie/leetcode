package prefix_sum;

/*
https://leetcode.com/problems/matrix-block-sum/description/
1314. Matrix Block Sum
Medium
Given a m x n matrix mat and an integer k, return a matrix answer where each answer[i][j] is the sum of all elements mat[r][c] for:

i - k <= r <= i + k,
j - k <= c <= j + k, and
(r, c) is a valid position in the matrix.


Example 1:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[12,21,16],[27,45,33],[24,39,28]]
Example 2:

Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
Output: [[45,45,45],[45,45,45],[45,45,45]]
 */

public class MatrixBlockSum_1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefix = new int[m][n];
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cell = mat[i][j];
                boolean hasUp = i > 0;
                boolean hasLeft = j > 0;
                cell = hasUp ? cell + prefix[i - 1][j] : cell;
                cell = hasLeft ? cell + prefix[i][j - 1] : cell;
                cell = hasUp && hasLeft ? cell - prefix[i - 1][j - 1] : cell;
                prefix[i][j] = cell;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int rowCorner = Math.min(m - 1, i + k);
                int columnCorner = Math.min(n - 1, j + k);
                int rowUp = i - k - 1;
                int columnLeft = j - k - 1;

                int subUp = rowUp >= 0 ? prefix[rowUp][columnCorner] : 0;
                int subLeft = columnLeft >= 0 ? prefix[rowCorner][columnLeft] : 0;
                int sum = (rowUp >=0 && columnLeft >= 0) ? prefix[rowUp][columnLeft] : 0;

                result[i][j] = prefix[rowCorner][columnCorner] - subUp - subLeft + sum;
            }
        }
        return result;
    }
}
