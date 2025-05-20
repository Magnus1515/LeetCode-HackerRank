package org.example;

public class Solution {
    public static int countSubarrays(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                for (int k = 0; k < nums.length; k++){

                    if (i == j || j == k || i ==k){
                        continue;
                    }
                    if (i + k == j / 2 ) {
                        result = 1;
                        break;
                    }else{
                        result = 0;
                    }

                }

            }
        }
        return result;
    }
}
