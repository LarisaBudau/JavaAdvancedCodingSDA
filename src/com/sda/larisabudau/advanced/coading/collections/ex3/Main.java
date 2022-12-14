package com.sda.larisabudau.advanced.coading.collections.ex3;

import java.util.*;

/**
 * Create a method that takes the map as a parameter, where the key is string and the value number,
 * and then prints each map element to the console in the format: Key: , Value: . There should be a comma at the
 * end of every line except the last, and a period at the last. Example:
 * Key: Java, Value: 18,
 * Key: Python,
 * Value: 1,
 * …
 * Key: PHP, Value: 0.
 */


public class Main {
    public static void main(String[] args) {

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Java", 18);
        stringIntegerMap.put("Python", 1);
        stringIntegerMap.put("PHP", 0);

        printMapContent(stringIntegerMap);

        printMapContentv2(stringIntegerMap);

    }

    public static void printMapContent(Map<String, Integer> inputMapContent) {
        Set<Map.Entry<String, Integer>> entries = inputMapContent.entrySet();

        for (Map.Entry<String, Integer> el : entries) {
            System.out.println("Key: " + el.getKey() + " , Value: " + el.getValue());
        }
    }


    public static void printMapContentv2(Map<String, Integer> inputMapContent) {
        Set<Map.Entry<String, Integer>> entries = inputMapContent.entrySet();   //set - castig unicitatea, dar pierd indexul
        List<Map.Entry<String, Integer>> entriesAsList = new ArrayList<>(entries);  //am convertit aici de la set la lista

        for (int i = 0; i < entriesAsList.size(); i++) {

            String endOfLine;

            if (i < entriesAsList.size() - 1) {
                endOfLine = ",";
            } else {
                endOfLine = ".";
            }
            System.out.println("Key: " + entriesAsList.get(i).getKey() + " , Value: " + entriesAsList.get(i).getValue() + endOfLine);
        }
    }
}
