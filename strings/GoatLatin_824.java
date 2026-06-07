package strings;

public class GoatLatin_824 {
    public String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        StringBuilder current = new StringBuilder();
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i].charAt(0))) {
                current.append(arr[i]);
            } else {
                current.append(arr[i].substring(1)).append(arr[i].charAt(0));
            }
            current.append("ma").repeat("a", i + 1);
            result.append(current).append(" ");
            current.setLength(0);
        }
        return result.toString().trim();
    }

    private boolean isVowel(char ch) {
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
}
