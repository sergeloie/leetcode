package matrix;

import java.util.Arrays;
import java.util.List;

public class SnakeinMatrix_3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int result = 0;
        for (String command : commands) {
            result += switch (command) {
                case "RIGHT" -> 1;
                case "LEFT" -> -1;
                case "DOWN" -> n;
                case "UP" -> -n;
                default -> 0;
            };
        }
        return result;
    }
}
