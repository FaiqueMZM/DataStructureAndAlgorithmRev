package Strings;

// remove duplicate characters from a given string

import java.util.HashSet;

public class removeDuplicates {

    public static String removeDuplicates1(String str) {
        HashSet<Character> duplicate = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // character order will be preserved

        for (char c : str.toCharArray()) {
            if (!duplicate.contains(c)) {
                duplicate.add(c); // Add character to the set
                result.append(c); // Append it to the result
            }
        }
        return result.toString();
    }

    public static String removeDuplicates2(String str) {
        HashSet<Character> duplicate = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // output character order will be based on hashset iteration, random order

        for(char c : str.toCharArray()){
            duplicate.add(c);
        }

        for(char c : duplicate){
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "aeroplane";

        System.out.println("Remove duplicates from "+ str + " : " + removeDuplicates1(str));
        System.out.println("Remove duplicates from "+ str + " : " + removeDuplicates2(str));
    }
}
