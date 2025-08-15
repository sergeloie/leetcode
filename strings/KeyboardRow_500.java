package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class KeyboardRow_500 {
    public String[] findWords(String[] words) {
        Set<Character> firstRow = "qwertyuiop".chars()
                .mapToObj(c -> (char) c )
                .collect(Collectors.toSet());
        Set<Character> secondRow = "asdfghjkl".chars()
                .mapToObj(c -> (char) c )
                .collect(Collectors.toSet());
        Set<Character> thirdRow = "zxcvbnm".chars()
                .mapToObj(c -> (char) c )
                .collect(Collectors.toSet());

        return Arrays.stream(words)
                .filter(word
                        -> isOneRowWord(word, firstRow)
                        || isOneRowWord(word, secondRow)
                        || isOneRowWord(word, thirdRow))
                .toArray(String[]::new);
    }

    public boolean isOneRowWord(String word, Set<Character> characters) {
        return word.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .allMatch(characters::contains);
    }
}
