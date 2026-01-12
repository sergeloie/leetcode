package array;

public class bitAnd2bitCharacters_717 {
    public boolean isOneBitCharacter(int[] bits) {
        boolean result = true;
        int count = 0;
        int end = bits.length - 1;
        while (count <= end) {
            if (bits[count] == 0) {
                result = true;
                count = count + 1;
            } else {
                result = false;
                count = count + 2;
            }
        }
        return result;
    }
}
