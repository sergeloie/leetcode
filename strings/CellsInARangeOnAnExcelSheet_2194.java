package strings;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet_2194 {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = s.toCharArray();
        int ch1 = alphabet.indexOf(chars[0]);
        int ch2 = alphabet.indexOf(chars[3]);
        int i1 = chars[1] - '0';
        int i2 = chars[4] - '0';

        for (int i = ch1; i <= ch2; i++) {
            for (int j = i1; j <= i2 ; j++) {
                result.add(String.valueOf(alphabet.charAt(i)) + j);
            }
        }
        return result;
    }
}
