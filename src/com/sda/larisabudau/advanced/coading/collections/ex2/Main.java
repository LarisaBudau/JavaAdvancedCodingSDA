package com.sda.larisabudau.advanced.coading.collections.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to A case-insensitive.
*/

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Andrei");
        stringList.add("Stefan");
        stringList.add("cristi");
        stringList.add("bike");
        stringList.add("TRUCH");
        System.out.println(orderCaseList(stringList));
    }

    public static List<String> orderCaseList (List<String> inputList){
        return inputList.stream()   //e o functie stream-ul
                .sorted((o1, o2) -> o2.compareToIgnoreCase(o1))
                .collect(Collectors.toList());
    }
}
