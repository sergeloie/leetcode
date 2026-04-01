package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightedWordMapping_3838 {

    public String mapWordWeights(String[] words, int[] weights) {
        return Arrays.stream(words)
                .map(word -> computeWordWeight(word, weights))
                .collect(Collectors.joining());
    }

    private String computeWordWeight(String word, int[] weights) {
        int i = word.chars()
                .map(ch -> weights[ch - 'a'])
                .sum();
        return String.valueOf((char) ('z' - i % 26));
    }
}
