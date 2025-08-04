package strings;

public class NumberOfSegmentsInAString_434 {
    public int countSegments(String s) {
        if (s.isBlank()) {
            return 0;
        }
        int count = 0;
        s = s.trim();
        if (s.charAt(0) == ' ') {
            count++;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
