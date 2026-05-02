package arrays;

public class DIStringMatch_942 {
    public int[] diStringMatch(String s) {
        int min = 0;
        int max = s.length();
        int[] result = new int[max + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = min++;
            }  else {
                result[i] = max--;
            }
        }
        result[s.length()] = max;
        return result;
    }
}
