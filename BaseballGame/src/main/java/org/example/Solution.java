package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
    '+'.
Record a new score that is the sum of the previous two scores.
        'D'.
Record a new score that is the double of the previous score.
    'C'.
Invalidate the previous score, removing it from the record.

Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
*/

public class Solution {

    public int calPoints(String[] operations) {

        Stack<String> callPointsStack =new Stack<>();

        //System.out.println(operations[0]);

//        for (String item : operations){
//            System.out.println(item);
//        }
        
        for (String item : operations){
            if (item.contains("1") || item.contains("2") || item.contains("3") || item.contains("4") || item.contains("5") ||
                    item.contains("6") || item.contains("7") || item.contains("8") || item.contains("9")){
                //int temp_string = Integer.parseInt(item);
                callPointsStack.push(item);
                System.out.println("Size of my stack" + callPointsStack.size());
                System.out.println("Adding this "+ item);
            } else if (item.contains("C")) {
                callPointsStack.pop();
                System.out.println("Deleting this "+ callPointsStack.getLast());
            } else if (item.contains("D")) {
                String lastItem = callPointsStack.lastElement();
                int temp_integer = Integer.parseInt(lastItem);
                int result = temp_integer * 2;
                callPointsStack.push(String.valueOf(result));
                System.out.println("D process " + result);
            } else if (item.contains("+")) {
                String lastItem = callPointsStack.getLast();
                String lastPreviousItem = callPointsStack.get(callPointsStack.size() - 2);
                int temp_integer1 =  Integer.parseInt(lastItem);
                int temp_integer2 = Integer.parseInt(lastPreviousItem);
                callPointsStack.push(String.valueOf(temp_integer1 + temp_integer2));
            }
        }

        //System.out.println("Size of my stack " + callPointsStack.size());

        ArrayList<Integer> intList = new ArrayList<>();

        for (String s : callPointsStack) {
            intList.add(Integer.parseInt(s));
        }

        int sum = 0;

        for (int num : intList){
            sum += num;
        }
        //System.out.println("Suma" + sum);
        return sum;

    }


}
