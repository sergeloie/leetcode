package codewars;

import java.util.Arrays;

public class DoesMyNumberLookBigInThis {
    public static boolean isNarcissistic(int number) {
        String str = String.valueOf(number);
        int power = str.length();
        int result = Arrays.stream(str.split(""))
                .map(Integer::valueOf)
                .map(x -> (int) Math.pow(x, power))
                .reduce(0, Integer::sum);
        return number == result;
    }
}
