package org.example;

import java.util.*;



/*
Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
*/


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Lucky number -> 2 becase is only one lucky number and case 1
        int[] case1 = {2, 2, 3, 4};

        // lucky number -> 3 because is the largest lucky number same like 2 but is the largest
        // case 2
        int[] case2 = {1, 2, 2, 3, 3, 3};
        // Lucky number 3

        // lucky number -> -1 because there is no lucky number in the array
        int[] case3 = {2, 2, 2, 3, 3};

        int[] case4 = {4,3,2,2,4,1,3,4,3};

        int[] case5 = {1, 2, 2, 3, 3, 3};



        //System.out.println(countFrecuency(case3,2));
//        Map<Integer, Integer> resultsHM = new HashMap<>();
//        ArrayList<Integer> uniqueArrayList = new ArrayList<>();
//        uniqueArrayList = uniqueListNumbers(case2);

        countFrecuency(case5, uniqueListNumbers(case5));


    }

    public static int countFrecuency(int[] originalArray, ArrayList<Integer> arrayList) {
        // ArrayList = unique numbers in the original array like just {1, 2, 3}
//        Map<Integer, Integer> luckyNumbersHM = new HashMap<>();
//        int[] arrayLuckyNumbers;
//        arrayLuckyNumbers = new int[10];
        ArrayList<Integer> arrayLuckyNumbers = new ArrayList<>();


        for (int i = 0; i < arrayList.size(); i++) {
            int count = 0;
            for (int number : originalArray) {

                if (number == arrayList.get(i)) {
                    count++;
                }
                //luckyNumbersHM.put(arrayList.get(i), count);
            }

            if (arrayList.get(i) == count){
                arrayLuckyNumbers.add(arrayList.get(i));
            }
        }

        if (arrayLuckyNumbers.isEmpty()) {
//            arrayLuckyNumbers[0] = -1;
            arrayLuckyNumbers.add(-1);
            System.out.println("-1 case " + arrayLuckyNumbers.get(0));
            return arrayLuckyNumbers.get(0);
        }else{
            int largestNumber = Collections.max(arrayList);

            return largestNumber;

        }
    }

    public static ArrayList<Integer> uniqueListNumbers(int[] array) {
        ArrayList<Integer> uniqueArrayList = new ArrayList<>();
        // way to know the unique numbers in the array
        for (int i = 0; i < array.length; i++) {
            if (!uniqueArrayList.contains(array[i])) {
                uniqueArrayList.add(array[i]);
            }
        }


        return uniqueArrayList;
    }
}

