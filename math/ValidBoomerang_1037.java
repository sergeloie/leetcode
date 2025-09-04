package math;

import java.util.Arrays;

public class ValidBoomerang_1037 {
    public boolean isBoomerang(int[][] points) {
        if (
                Arrays.equals(points[0], points[1])
                        || Arrays.equals(points[1], points[2])
                        || Arrays.equals(points[2], points[0])
        ) {
            return false;
        }

        return !((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) ==
                (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]));
    }
}
