import hashmap.FindWordsThatCanBeFormedByCharacters_1160;
import hashmap.RansomNote_383;
import math.AddDigits_258;

public class Main {
    public static void main(String[] args) {
        FindWordsThatCanBeFormedByCharacters_1160 cls = new FindWordsThatCanBeFormedByCharacters_1160();
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        int result = cls.countCharacters(words, chars);
        System.out.println(result);
    }
}
