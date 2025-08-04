package strings;

import java.math.BigInteger;

public class AddBinary_67 {
    public String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int overhead = 0;
        StringBuilder sb = new StringBuilder();

        while (aIndex >= 0 || bIndex >= 0) {
            int sum = 0;
            if (aIndex >= 0) {
                sum += Character.getNumericValue(a.charAt(aIndex));
            }
            if (bIndex >= 0) {
                sum += Character.getNumericValue(b.charAt(bIndex));
            }
            sum += overhead;
            switch (sum) {
                case 0 -> sb.insert(0, 0);
                case 1 -> {
                    sb.insert(0, 1);
                    overhead = 0;
                }
                case 2 -> {
                    sb.insert(0, 0);
                    overhead = 1;
                }
                case 3 -> sb.insert(0, 1);
            }
            aIndex--;
            bIndex--;

        }
        if (overhead > 0) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }

    public String addBinary2(String a, String b) {
        BigInteger bigA = new BigInteger(a ,2);
        BigInteger bigB = new BigInteger(b, 2);
        return bigA.add(bigB).toString(2);
    }
}
