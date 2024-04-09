package org.example;

import org.example.problems.CustomHashMap;
import org.example.problems.IsUnique;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> customHashMap = new CustomHashMap<>();
        customHashMap.add("a", 1);
        customHashMap.add("b", 2);
        System.out.println(customHashMap.get("a"));
        System.out.println(customHashMap);
        customHashMap.remove("a");
        System.out.println(customHashMap);

        String str = "aba";
        IsUnique.bestSolution(str);
        IsUnique.sorting(str);
        IsUnique.bruteForce(str);
    }
}