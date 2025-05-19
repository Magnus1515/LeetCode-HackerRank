package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] digits = {2,6,3,7,0,0,4,0,1,6,1,3,7,1,2,7,6,7,8,5,6,0,1,1,2,9,3,1,1,2,7,1,5,8,9,2,8,3,3,1,0,7,0,3,9,6,0,3,9,9,5,1,7,5,8,1,3,9,3,5,0,5,2,4,8,3,7,7,2,6,4,5,8,5,7,9,0,6,9,3,1,3,1,7,9,9,1,8,0,7,2,0,5,6,7,9,8,0,9,2};
        int[] solution = Solution.findEvenNumbers(digits);
        //[0,0,1,1,1,2,2,3,3,4]

        System.out.println(Arrays.toString(solution));



    }


}