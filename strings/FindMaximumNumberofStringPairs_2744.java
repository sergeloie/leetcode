package strings;

import java.util.HashSet;
import java.util.Set;

public class FindMaximumNumberofStringPairs_2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String word : words) {
            if (set.contains(new StringBuilder(word).reverse().toString())) {
                count++;
            }
            set.add(word);
        }
        return count;
    }
}
