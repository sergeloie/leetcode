package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertDateToBinary_3280 {
    public String convertDateToBinary(String date) {
        return Arrays.stream(date.split("-"))
                .map(Integer::parseInt)
                .map(Integer::toBinaryString)
                .collect(Collectors.joining("-"));
    }
}
