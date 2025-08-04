package strings;

public class ReversePrefixOfWord_2000 {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        return new StringBuilder()
                .append(word, 0, index + 1)
                .reverse()
                .append(word, index + 1, word.length())
                .toString();
    }
}
