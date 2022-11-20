package com.sda.larisabudau.advanced.coading.collections.ex5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value) → adding elements to the storage
 * printValues(String key) → displaying all elements under a given key
 * findValues(String value) → displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */

public class Main {
    public static void main(String[] args) {

        Storage students = new Storage();

        students.addToStorage("Ro45", "Larisa");
        students.addToStorage("Ro45", "Bogdan");
        students.addToStorage("Ro45", "Andrei");
        students.addToStorage("Ro45", "Ionela");
        students.addToStorage("Ro45", "Dumitru");

        students.addToStorage("Ro46", "Andrei");
        students.addToStorage("Ro46", "Luca");
        students.addToStorage("Ro46", "Elena");

        students.printValues("Ro45");
        students.printValues("Ro46");
        students.printValues("Ro47");

        System.out.println("Studentul Andrei se regaseste in grupele: " + students.findKeys("Andrei"));
        System.out.println("Studentul Bogdan se regaseste in grupa: " + students.findKeys("Bogdan"));
        System.out.println(students.findKeys("Ion"));
    }

}
