package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        s1 = "apple apple";
        s2 = "banana";
        String[] solution = Solution.uncommonFromSentences(s1,s2);

        //[0,0,1,1,1,2,2,3,3,4]

        System.out.println(Arrays.toString(solution));


    }
}