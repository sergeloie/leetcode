package matrix;

public class ReshapetheMatrix_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        int rCount = 0;
        int cCount = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[rCount][cCount] = mat[i][j];
                rCount = cCount == c - 1 ? rCount + 1 : rCount;
                cCount = cCount == c - 1 ? 0 : cCount + 1;
            }
        }
        return result;
    }
}
