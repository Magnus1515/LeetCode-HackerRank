package org.example;

import java.util.ArrayList;

// LeetCode 20. Valid Parentheses

public class Soluction {
    public boolean isValid(String s) {


        while (s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()","")
            .replace("{}","")
            .replace("[]","");

        } return s.isEmpty();

    }
}

