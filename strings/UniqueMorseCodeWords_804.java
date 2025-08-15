package strings;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueMorseCodeWords_804 {
    public int uniqueMorseRepresentations(String[] words) {
        return (int) Arrays.stream(words)
                .map(this::toMorse)
                .distinct()
                .count();
    }

    public String toMorse(String word) {
        List<String> list = List.of(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        return word.chars()
                .map(el -> el - 'a')
                .mapToObj(list::get)
                .collect(Collectors.joining());
    }
}
