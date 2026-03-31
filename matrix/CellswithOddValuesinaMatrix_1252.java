package matrix;

public class CellswithOddValuesinaMatrix_1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            updateMatrix(index[0], index[1], matrix);
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count = matrix[i][j] % 2 == 0 ? count : count + 1;

            }
        }

        return count;
    }

    public void updateMatrix(int rowIndex, int columnIndex, int[][] matrix) {
        int rowLastIndex = matrix.length - 1;
        int columnLastIndex = matrix[0].length - 1;
        for (int i = 0; i <= columnLastIndex; i++) {
            matrix[rowIndex][i] = matrix[rowIndex][i] + 1;
        }

        for (int i = 0; i <= rowLastIndex; i++) {
            matrix[i][columnIndex] = matrix[i][columnIndex] + 1;
        }
    }

}
