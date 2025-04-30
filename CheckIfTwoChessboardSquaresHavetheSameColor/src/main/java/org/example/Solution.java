package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.

Below is the chessboard for reference.

Return true if these two squares have the same color and false otherwise.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first (indicating its column), and the number second (indicating its row).

Example 1:

Input: coordinate1 = "a1", coordinate2 = "c3"

Output: true

Explanation:

Both squares are black.

Example 2:

Input: coordinate1 = "a1", coordinate2 = "h3"

Output: false

Explanation:

Square "a1" is black and "h3" is white.

*/

public class Solution {
    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        Map<String, Integer> boardMap = new HashMap<>();
        char[] columns = {'a','b','c','d','e','f','g','h'};

        // It's a more efficient way to add the values to the Hashmap It added manually but found cleanest way to do it

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                // The 8 - row is because the values from the board are reverse as is used to fill it up the array from the top to bottom
                String coord = columns[col] + String.valueOf(8 - row);
                // This is to alternate from 0 to 1
                int value = (row + col) % 2;
                boardMap.put(coord, value);
            }
        }


//        Example: printing the whole map
//        for (String key : boardMap.keySet()) {
//            System.out.println(key + " => " + boardMap.get(key));
//        }
        if (boardMap.containsKey(coordinate1) || boardMap.containsKey(coordinate2)){
            return boardMap.get(coordinate1).equals(boardMap.get(coordinate2));
        }

        return boardMap.get(coordinate1).equals(boardMap.get(coordinate2));

    }
}
