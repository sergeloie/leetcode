package strings;

public class CountAsterisks_2315 {
    public int countAsterisks(String s) {
        int count = 0;
        boolean pipe = true;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '|' -> pipe = !pipe;
                case '*' -> {
                    if (pipe) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
