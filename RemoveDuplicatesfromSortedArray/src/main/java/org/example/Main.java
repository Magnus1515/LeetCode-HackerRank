package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int solution = Solution.removeDuplicates(new int[]{1,1,2});
        int solution2 = Solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        //[0,0,1,1,1,2,2,3,3,4]
         System.out.println(solution2);
    }
}