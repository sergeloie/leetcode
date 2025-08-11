package strings;

public class DetectCapital_520 {
    public boolean detectCapitalUse(String word) {
        boolean lastCase = Character.isUpperCase(word.charAt(word.length() - 1));
        // Если UpperCase, то все должны быть UpperCase
        // Если LowerCase, то все маленькие до 1 элемента включительно, 0 элемент - всё равно

        for (int i = word.length() - 2; i > 0 ; i--) {
            boolean currentCase = Character.isUpperCase(word.charAt(i));
            if (currentCase != lastCase) {
                return false;
            }
        }

        boolean firstCase = Character.isUpperCase(word.charAt(0));
        return !lastCase || firstCase;
    }
}
