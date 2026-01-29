package org.sparky;

import java.util.HashMap;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - value)};
            }
            map.put(value, i);
        }
        return new int[]{};
    }
}