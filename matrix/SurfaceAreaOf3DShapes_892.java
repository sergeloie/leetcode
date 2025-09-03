package matrix;

import java.util.Arrays;

public class SurfaceAreaOf3DShapes_892 {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int[][] matrix = new int[n + 2][n + 2];
        for (int i = 0; i < n; i++) {
            System.arraycopy(grid[i], 0, matrix[i + 1], 1, n);
        }

        int square = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                square += countSquare(matrix, i, j);

            }
        }
        return square;
    }

    public int countSquare(int[][] matrix, int row, int column) {
        int thisHeight = matrix[row][column];
        if (thisHeight == 0) {
            return 0;
        }
        int[][] offset4 = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int square = 2;
        for (int[] ints : offset4) {
            int neighbourHeight = matrix[row + ints[0]][column + ints[1]];
            if (thisHeight > neighbourHeight) {
                square += thisHeight - neighbourHeight;
            }
        }
        return square;
    }
}
