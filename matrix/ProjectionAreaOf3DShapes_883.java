package matrix;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ProjectionAreaOf3DShapes_883 {
    public int projectionArea(int[][] grid) {
        int area = 0;
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            int rowMax = 0;
            int colMax = 0;
            for (int j = 0; j < n; j++) {
                rowMax = Math.max(rowMax, grid[i][j]);
                colMax = Math.max(colMax, grid[j][i]);
                if (grid[i][j] > 0) {
                    area++;
                }
            }
            area += rowMax;
            area += colMax;
        }
        return area;
    }
}
