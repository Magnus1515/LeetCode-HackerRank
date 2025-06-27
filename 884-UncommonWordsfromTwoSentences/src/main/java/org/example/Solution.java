package org.example;

import java.util.*;
import java.util.stream.Stream;

/*Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"

Output: ["sweet","sour"]

Explanation:

The word "sweet" appears only in s1, while the word "sour" appears only in s2.

Example 2:

Input: s1 = "apple apple", s2 = "banana"

Output: ["banana"]*/


public class Solution {
    public static String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> words = new HashMap<>();
        String actualWord;

        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        String[] combinedWords = Stream.concat(Arrays.stream(words1), Arrays.stream(words2))
                .toArray(String[]::new);

        for (String word: combinedWords){
            boolean valueExists = words.containsKey(word);

            words.put(word, words.getOrDefault(word, 0) + 1);

        }
        //System.out.println(List.of(words));
        List<String> outputArrayList = new ArrayList<>();
        for (String key : words.keySet()) {
            if (words.get(key) == 1){
                //output[counter] = key;
                outputArrayList.add(key);
            }
        }

        return outputArrayList.toArray(new String[0]);

        // int[] tempArray = Arrays.copyOfRange(nums, s, h+1)
    }
}
