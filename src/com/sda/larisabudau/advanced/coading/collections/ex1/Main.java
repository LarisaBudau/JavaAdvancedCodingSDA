package com.sda.larisabudau.advanced.coading.collections.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A.
 */

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Andrei");
        list.add("Stefan");
        list.add("Cristi");
        System.out.println(sortList(list));
    }

    public static List<String> sortList(List<String> input) {  //o metoda publica care returneaza o lista cu obiecte de tip string si are ca parametrii o lista cu obiecte de tip string

        List<String> sortedList = new ArrayList<>();    //implementarea pentru lista in java

        sortedList.addAll(input);

        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o2.compareTo(o1);
                System.out.println(o1 + "compare vith " + o2 + " is " + result);
                return result;
            }
        });
        return sortedList;

    }


    public static List<String> sortedListWithLambda(List<String> input) {  //o metoda publica care returneaza o lista cu obiecte de tip string si are ca parametrii o lista cu obiecte de tip string

        List<String> sortedList = new ArrayList<>();    //implementarea pentru lista in java

        sortedList.addAll(input);
        sortedList.sort((o1, o2) -> {
            int result = o2.compareTo(o1);
            System.out.println(o1 + "compare vith " + o2 + " is " + result);
            return result;
        });
        return sortedList;

    }

    public static List<String> sortedListWithStreams(List<String> input) {  //o metoda publica care returneaza o lista cu obiecte de tip string si are ca parametrii o lista cu obiecte de tip string
        return input.stream()   //asa deschidem stream-ul
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());  //pasul final
    }
}
