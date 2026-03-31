package matrix;

public class CheckIfItIsaStraightLine_1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        int lastIndex = coordinates.length - 1;

        for (int i = 2; i <= lastIndex ; i++) {
            if (!collinear(x1, y1, x2, y2, coordinates[i][0], coordinates[i][1])) {
                return false;
            }
        }

        return true;

    }

    public boolean collinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        return x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2) == 0;
    }
}
