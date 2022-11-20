package com.sda.larisabudau.advanced.coading.collections.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a program which creates a concordance of characters occurring in a string
 * (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(getCharactersPosition("HelloWorld"));
    }

    public static Map<Character, List<Integer>> getCharactersPosition(String input) {

        Map<Character, List<Integer>> positionByChar = new HashMap<>();

        input.toCharArray(); //da un array cu aabc-/["a", "a", "b", "c"]

        for (int i = 0; i < input.toCharArray().length; i++) {
            char currentChar = input.toCharArray()[i];

            if (positionByChar.containsKey(currentChar)) {
                List<Integer> positionOfChar = positionByChar.get(currentChar);
                positionOfChar.add(i);
                positionByChar.put(currentChar, positionOfChar);    //put e doar pentru map
            } else {
                List<Integer> positionOfChar = new ArrayList<>();
                positionOfChar.add(i);
                positionByChar.put(currentChar, positionOfChar);    //put e doar pentru map
            }
        }

        return positionByChar;
    }

}
