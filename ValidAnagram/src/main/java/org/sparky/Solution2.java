package org.sparky;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();

        // Count how many times find that letter in s
        for (char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        // Subtracting how many times find that letter in t
        for (char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)-1);
        }

        // finally we need to verify that everything is 0
        for (int val : map.values()){
            if (val != 0) {
                // If not 0 that means not an anagram
                return false;
            }
        }
        // Equally letter quantity means an anagram
        return true;
    }
}