package org.example.problems;

import java.util.HashSet;

public class Problems {
    /*
     * Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     */
    public static void isUnique(){
        // brute-force approach
        // tc - O(N)
        // sc - O(N)
        String str = "abc";
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }

        if(set.size() == str.length()) System.out.println("String is unique");
        else System.out.println("String is not unique");

        // second approach - sorting
        // tc - O(NlogN)
        // sc - O(1)
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);

        for(int i=0; i<charArray.length-1; i++){
            if(charArray[i] == charArray[i+1]){
                System.out.println("String is not unique");
                return;
            }
        }
        // third approach - bit manipulation (best way)
        // tc - O(N)
        // sc - O(1)

        // checker integer has 32 bits in it, use those 32 bits as an array
        // initially all the 32 bits are set to 0
        int checker  = 0;
        for(int i=0; i<str.length(); i++){
            // map the char ascii value to the range of (0-26)
            int bitPosition = str.charAt(i) % 'a';

            // check if the position'th bit is already set in checker
            // if yes, duplicate is present in the given string
            // if not set the charValue'th bit in the checker number
            if((checker & (1 << bitPosition)) > 0){
                System.out.println("String is not unique");
                return;
            }
            else{
                // set the nth bit in the checker number
                checker = (checker | (1 << bitPosition));
            }
        }
        System.out.println("String is unique");
    }
}