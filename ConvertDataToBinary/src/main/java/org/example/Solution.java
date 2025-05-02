package org.example;

import java.util.ArrayList;

/*
You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.

date can be written in its binary representation obtained by converting year, month, and day to their binary representations without any leading zeroes and writing them down in year-month-day format.

Return the binary representation of date.



Example 1:

Input: date = "2080-02-29"

Output: "100000100000-10-11101"

Explanation:

        100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 respectively.

        Example 2:

Input: date = "1900-01-01"

Output: "11101101100-1-1"

Explanation:

        11101101100, 1, and 1 are the binary representations of 1900, 1, and 1 respectively.
*/


public class Solution {

    public static String convertDateToBinary(String date) {

//        int dateInteger = Integer.parseInt(date);
        
        String month = "";
        String day = "";
        String year = "";
        for (char c : date.toCharArray()) {
            // Kinda bad practices here but sometimes is the better idea to solved in less time
            year = String.valueOf(date.charAt(0)) + String.valueOf(date.charAt(1)) + String.valueOf(date.charAt(2)) + String.valueOf(date.charAt(3));
            month = String.valueOf(date.charAt(5)) + String.valueOf(date.charAt(6));
            day = String.valueOf(date.charAt(8))+ String.valueOf(date.charAt(9));
        }

//        System.out.println("year -> " + year);
//        System.out.println("month -> " + month);
//        System.out.println("day -> " + day);
//
//        int newYear = Integer.parseInt(year);
//        int newMonth = Integer.parseInt(month);
//        int newDay = Integer.parseInt(day);

        int[] dateArray = {Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day)};

        //System.out.println("First year " + dateArray[0]);

        // ArrayLit to save the results year, month, day
        ArrayList<String> resultList = new ArrayList<>();
        for (int item: dateArray){
            String result = "";
            int remainder;

            // I was so close after debugging I find I was using this condition (item / 2 != 0) thinking about the operation instead of the item were I saved quotient for better understand
            // so it was just change that and It works
            while (item != 0){
                remainder = item % 2;
                item = item / 2;
                // result = result + String.valueOf(remainder);
                result = remainder + result;
                //System.out.println("Item " + item + " Result " + result );
            }
            // String reversed = new StringBuilder(original).reverse().toString();
            //resultList.add(new StringBuilder(result).reverse().toString());
            resultList.add(result.isEmpty() ? "0" : result);
        }

        String finalResult1 = String.valueOf(resultList.get(0));
        String finalResult2 = String.valueOf(resultList.get(1));
        String finalResult3 = String.valueOf(resultList.get(2));

        return finalResult1+"-"+finalResult2+"-"+finalResult3;

    }
}
