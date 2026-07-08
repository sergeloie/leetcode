package strings;

public class VerifyinganAlienDictionary_953 {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            if (!isLessThan(words[i], words[i + 1], order)) {
                return false;
            }
        }
        return true;
    }

    private boolean isLessThan(String s1, String s2, String alphabet) {
        int lastIndex = Math.min(s1.length(), s2.length()) - 1;
        for (int i = 0; i <= lastIndex; i++) {
            int index1 = alphabet.indexOf(s1.charAt(i));
            int index2 = alphabet.indexOf(s2.charAt(i));
            if (index1 < index2) {
                return true;
            } else if (index1 > index2 ) {
                return false;
            }
        }
        return s1.length() <= s2.length();
    }
}
