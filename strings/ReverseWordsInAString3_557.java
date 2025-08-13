package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAString3_557 {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining(" "));
    }
}
