package org.example;

import java.util.Arrays;

public class Solution {
    public static int countSubarrays(int[] nums) {
        int result = 0;
        int s = 0;
        int h = 2;
        int n = nums.length;

        while (h < n) {

            int[] tempArray = Arrays.copyOfRange(nums, s, h+1);

            double firstPart = tempArray[0] + (tempArray[2]);
            double secondPart = tempArray[1] * 0.5;
//            System.out.println(firstPart + " " + secondPart);
            if (firstPart == secondPart) {
                result++;
            } else if (firstPart != secondPart) {
                result += 0;
            }
            s ++;
            h ++;
        }
        return result;
    }
}
