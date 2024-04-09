package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<String, Integer> map = new HashMap<>();
        map.add("one", 1);
        map.add("two", 2);
        System.out.println(map);
        map.remove("one");
        System.out.println(map);
    }
}