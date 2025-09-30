package array;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram_1832 {
    public boolean checkIfPangram(String sentence) {
        int[] abc = new int[26];
        for (char ch: sentence.toCharArray()) {
            int index = ch - 'a';
            abc[index] = 1;
        }
        for (int i: abc) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
}
