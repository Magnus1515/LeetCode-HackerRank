package org.example;


/*You are given an integer array digits, where each element is a digit. The array may contain duplicates.

You need to find all the unique integers that follow the given requirements:

The integer consists of the concatenation of three elements from digits in any arbitrary order.
The integer does not have leading zeros.
The integer is even.

For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.

Return a sorted array of the unique integers.*/

//Input: digits = [2,1,3,0]
//Output: [102,120,130,132,210,230,302,310,312,320]
//Explanation: All the possible integers that follow the requirements are in the output array.
//Notice that there are no odd integers or integers with leading zeros.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        HashSet<Integer> resultHS = new HashSet<>();

        for (int i = 0; i < digits.length; i++){
            for(int j = 0; j < digits.length; j++){
                for (int k = 0; k < digits.length; k++){

                    if (i == j || j == k || i ==k){
                        continue;
                    }
                    int num = digits[i]*100 + digits[j]*10 + digits[k]*1;

                    if (digits[i] != 0 && num % 2 == 0 && !resultHS.contains(num)){
                        result.add(num);
                        resultHS.add(num);

                    }
                }

            }
        }

        Collections.sort(result);

//        int[] finalResult = result.stream().mapToInt(Integer::intValue).toArray();
//        return finalResult;

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
