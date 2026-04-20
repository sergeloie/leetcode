package matrix;

public class MinimumTimeVisitingAllPoints_1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        int x1 = points[0][0];
        int y1 = points[0][1];
        for (int[] point : points) {
            int diffX = Math.abs(point[0] - x1);
            int diffY = Math.abs(point[1] - y1);
            result += Math.max(diffX, diffY);
            x1 = point[0];
            y1 = point[1];
        }
        return result;
    }
}
