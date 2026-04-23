package hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if (!map.containsKey(sChar) && !map.containsValue(tChar)) {

            }
        }

    }
}
