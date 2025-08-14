package matrix;

public class LargestTriangleArea_812 {
    public double largestTriangleArea(int[][] points) {
        int lastIndex = points.length - 1;
        double maxArea = 0;
        for (int i = 0; i <= lastIndex - 2; i++) {
            for (int j = i + 1; j <= lastIndex -1 ; j++) {
                for (int k = j + 1; k <= lastIndex; k++) {
                    maxArea = Math.max(maxArea, getArea(points[i], points[j], points[k]));
                }
            }
        }
        return maxArea;
    }

    public double getArea(int[] p1, int[] p2, int[] p3) {
        return (double) Math.abs(
                p1[0] * (p2[1] - p3[1])
                        + p2[0] * (p3[1] - p1[1])
                        + p3[0] * (p1[1] - p2[1]))
                / 2;
    }
}
