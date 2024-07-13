package hashset;

/*
https://leetcode.com/problems/path-crossing/description/
1496. Path Crossing
Easy

Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.



Example 1:

Input: path = "NES"
Output: false
Explanation: Notice that the path doesn't cross any point more than once.

Example 2:

Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
 */

import java.util.HashSet;
import java.util.Set;

public class PathCrossing_1496 {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        set.add("0,0");
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            switch (ch) {
                case 'N' -> y++;
                case 'E' -> x++;
                case 'S' -> y--;
                case 'W' -> x--;
            }
            if (!set.add(x + "," + y)) {
                return true;
            }
        }
        return false;
    }
}
