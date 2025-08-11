package hashmap;

import java.util.stream.IntStream;

public class FindTheDifference_389 {
    public char findTheDifference(String s, String t) {
        int result = IntStream.concat(s.chars(), t.chars())
                .reduce(0, (x, y) -> x ^ y);
        return (char) result;
    }
}
