package strings;

import java.util.Arrays;

public class CountingWordsWithAGivenPrefix_2185 {
    public int prefixCount(String[] words, String pref) {
        return (int) Arrays.stream(words)
                .filter(s -> s.startsWith(pref))
                .count();
    }
}
