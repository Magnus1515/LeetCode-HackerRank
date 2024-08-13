import java.util.Arrays;

class Solution {
    // public String longestCommonPrefix(String[] strs) {
    //     Arrays.sort(strs);
    //     String s1 = strs[0];
    //     String s2 = strs[strs.length-1];
    //     System.out.println("s1: " + s1 + "\ns2: " + s2);
    //     int idx = 0;
    //     while(idx < s1.length() && idx < s2.length()){
    //         if(s1.charAt(idx) == s2.charAt(idx)){
    //             idx++;
    //         } else {
    //             break;
    //         }
    //     }
    //     return s1.substring(0, idx);
    // }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String word_1 = strs[0];
        String word_2 = strs[strs.length-1];
        int primary_index = 0;

        // System.out.println(word.charAt(0));
        // return same_values;

        while (primary_index < word_1.length() && primary_index < word_2.length()){
            if(word_1.charAt(primary_index) == word_2.charAt(primary_index)){
                primary_index++;
            }else{
                break;
            }
        }
        return word_1.substring(0,primary_index);
        

    }
    

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        //String[] strs = {"a"};
        String[] strs = {"flower","flow","flight"};
        String result = solution.longestCommonPrefix(strs);
        
        System.out.println("Longest Common Prefix: " + result);
    }
}