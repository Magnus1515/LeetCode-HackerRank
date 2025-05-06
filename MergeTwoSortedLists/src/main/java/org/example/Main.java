package org.example;

import java.util.*;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */

        ArrayList<Integer> resultArrayList = new ArrayList<>(resultArrayList1);

        // itereate over list 1 to add the values to our array
        while (list1 != null){
            resultArrayList.add(list1.val);
            // Important to move to the next node
            list1 = list1.next;

        }
        // Same process with list number 2
        while (list2 != null){
            resultArrayList.add(list2.val);
            list2 = list2.next;

        }
        // This time I use the sort function already defined
        Collections.sort(resultArrayList);

        // Just because the output need to be in ListNode
        // I have to create another ListNode like in the description says
        ListNode tempLN = ListNode(0);
        ListNode current = tempLN;
        // Iterate over the values in our result arrayList
        for (int val : resultArrayList) {
            // The current.next is going to be the next new node value
            current.next = new ListNode(val);
            // Move our current pointer to the next node
            current = current.next;
        }

        return tempLN.next;



//        int[] resultArray = IntStream.concat(Arrays.stream(case1array1),Arrays.stream(case1array2)).toArray();
//        Arrays.sort(resultArray);

//        for (int number1 : case1array1){
//            for (int number2 : case1array2){
//                if (number1 < number2){
//
//                }
//            }
//        }


    }
}