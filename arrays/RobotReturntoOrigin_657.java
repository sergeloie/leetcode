package arrays;

public class RobotReturntoOrigin_657 {
    public boolean judgeCircle(String moves) {
        int v = 0;
        int h = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U' -> v++;
                case 'D' -> v--;
                case 'R' -> h++;
                case 'L' -> h--;
            }
        }
        return v == 0 && h == 0;
    }
}
