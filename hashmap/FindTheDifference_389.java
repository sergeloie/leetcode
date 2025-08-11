package hashmap;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindTheDifference_389 {
    public char findTheDifference(String s, String t) {
        int result = IntStream.concat(s.chars(), t.chars())
                .reduce(0, (x, y) -> x ^ y);
        return (char) result;
    }
}
