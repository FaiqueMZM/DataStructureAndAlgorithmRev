package Strings;

// check if two strings are anagrams

import java.util.Arrays;

public class areAnagrams {

    public static boolean areAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";

        System.out.println("Are " + str1 + " and " + str2 + " anagrams ? " + areAnagrams(str1, str2));
    }
}
