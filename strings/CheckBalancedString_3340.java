package strings;

public class CheckBalancedString_3340 {
    public boolean isBalanced(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i = i + 2) {
            sum += num.charAt(i) - '0';
        }

        for (int i = 1; i < num.length(); i = i + 2) {
            sum -= num.charAt(i) - '0';
        }

        return sum == 0;
    }
}
