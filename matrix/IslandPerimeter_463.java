package matrix;

public class IslandPerimeter_463 {
    public int islandPerimeter(int[][] grid) {
        int[][] matrix = surroundGrid(grid);
        int perimeter = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] == 1) {
                    perimeter += countCellBorder(matrix, i, j);
                }
            }
        }
        return perimeter;
    }

    public int[][] surroundGrid(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] result = new int[row + 2][col + 2];
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < col + 1; j++) {
                result[i][j] = grid[i - 1][j - 1];
            }
        }
        return result;
    }

    public int countCellBorder(int[][] matrix, int row, int column) {
        return 4
                - matrix[row][column - 1]
                - matrix[row - 1][column]
                - matrix[row][column + 1]
                - matrix[row + 1][column];
    }
}
