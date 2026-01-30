package org.sparky;

import java.util.HashMap;
import java.util.Locale;

public class Solution {
    public static boolean isPalindrome(String s) {
// This one is also one of the normal ones
//        String clean = s.replace(",", "")
//                .replace(".", "")
//                .replace(":","")
//                .replace(" ","")
//                .replace("/","")
//                .toLowerCase();
//        Common way to accept just letters
//        String clean = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
//        The way to accept numbers an digits
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        After getting the clean array
        char[] arr = clean.toCharArray();
        System.out.println(clean);
        System.out.println(arr.length);
//      I use the two pointer technique one way from the right and one from the left
        for (int right = 0; right < clean.length(); right++){
//            Important to remember how to do a reverse interaction
            for (int left = clean.length() - 1; left >= 0; left--){
                if (arr[right] != arr[left]){
                    return false;
                }
//              I need to move up after comparing the first or second right one so is the exact moment to move, after debugging I found this
                right++;
            }
        }
        return true;


    }
}