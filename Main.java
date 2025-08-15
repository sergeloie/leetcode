import matrix.IslandPerimeter_463;
import strings.KeyboardRow_500;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        KeyboardRow_500 cls = new KeyboardRow_500();
        int[][] grid = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] grid2 = new int[][]{{1, 0}};

        Set<Character> firstRow = "qwertyuiop".chars()
                .mapToObj(c -> (char) c )
                .collect(Collectors.toSet());
        Set<Character> secondRow = "asdfghjkl".chars()
                .mapToObj(c -> (char) c )
                .collect(Collectors.toSet());
        Set<Character> thirdRow = "zxcvbnm".chars()
                .mapToObj(c -> (char) c )
                .collect(Collectors.toSet());

        System.out.println(Arrays.toString(cls.findWords(new String[]{"adsdf","sfd"})));


    }
}


