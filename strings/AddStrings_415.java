package strings;

public class AddStrings_415 {
    public String addStrings(String num1, String num2) {
        int n1Last = num1.length() - 1;
        int n2Last = num2.length() - 1;

        StringBuilder sb = new StringBuilder();

        int excess = 0;
        int localSum = 0;

        while (n1Last >= 0 || n2Last >= 0) {
            int temp = 0;
            if (n1Last >= 0) {
                temp += num1.charAt(n1Last--) - '0';
            }

            if (n2Last >= 0) {
                temp += num2.charAt(n2Last--) - '0';
            }

            localSum = (temp + excess) % 10;
            excess = (temp + excess) / 10;
            sb.append(localSum);
        }
        if (excess > 0) {
            sb.append(excess);
        }

        return sb.reverse().toString();
    }
}
