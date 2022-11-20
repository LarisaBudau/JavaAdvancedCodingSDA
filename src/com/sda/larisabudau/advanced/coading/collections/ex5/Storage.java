package com.sda.larisabudau.advanced.coading.collections.ex5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value) → adding elements to the storage
 * printValues(String key) → displaying all elements under a given key
 * findKeys(String value) → displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */
public class Storage {

    private final Map<String, List<String>> mapStorage = new HashMap<>();

    public void addToStorage(String key, String value) {
        if (mapStorage.containsKey(key)) {
            List<String> values = mapStorage.get(key);
            values.add(value);
            mapStorage.put(key, values);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            mapStorage.put(key, values);
        }

    }


    public void printValues(String key) {
        List<String> values = mapStorage.get(key);
        if (values == null) {
            System.out.println("No values for key: " + key);
        } else {
            System.out.println("Values for key: " + key + " -> " + values);
        }
    }

    public Set<String> findKeys(String value) {
        Set<String> keys = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : mapStorage.entrySet()) {
            if (entry.getValue().contains(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }


    public Set<String> findKeysWithStreams(String value) {
        return mapStorage.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
    }
}
