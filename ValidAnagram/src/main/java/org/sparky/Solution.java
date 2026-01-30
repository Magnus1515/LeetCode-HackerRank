package org.sparky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        // This was my solution

        Map<Character, Integer> map = new HashMap<>();
        String v = s + t;

        if (s.length() == t.length()){
            for (char c : v.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            System.out.println(map);
            return sameCountValues(map);
        }
        return false;
    }
    public static boolean sameCountValues(Map<Character, Integer> map){
        boolean sameValues = true;
        for(int val: map.values()){
            System.out.println(val);
            if (val % 2 != 0){
                sameValues = false;
                break;
            }
        }
        return sameValues;
    }
}