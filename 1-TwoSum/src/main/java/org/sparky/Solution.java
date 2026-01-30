package org.sparky;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // We need to iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // This second foor loop is important to compare pairs in the same array, and we can't repeat numbers
            for (int j = i + 1; j < nums.length; j++) {
                // We are looking the two numbers that sum up the targe.
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0, 0};
    }
}