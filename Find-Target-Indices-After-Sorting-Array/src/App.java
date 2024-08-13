import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int[] sort_array = nums;
        Arrays.sort(sort_array);
        //List<Integer> list = Arrays.asList(sort_array);

        List<Integer> list = new ArrayList<Integer>();
        int index = 0;
        for (int num : sort_array){
            if(num == target){
                list.add(index);
                
            }
            index++;
        }

        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // List<Integer> targetIndices(, 2);

        int[] nums = {1,2,5,2,3};
        int target = 2;

        List <Integer> result = solution.targetIndices(nums, target);
                
        System.out.println("Find target indices after sorting array: " + result);
        

    }
}