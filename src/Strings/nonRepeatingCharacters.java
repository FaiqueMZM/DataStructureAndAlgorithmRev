package Strings;

// get the non-repeating characters from a string

import java.util.HashMap;
import java.util.Map;

public class nonRepeatingCharacters {

    public static String nonRepeatingCharacters(String str) {
        HashMap<Character, Integer> characters = new HashMap<>();

        for(char c : str.toCharArray()){
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : characters.entrySet()){
            result.append(entry.getKey());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "programming";

        System.out.println("Non-repeating characters in " + str + " : " + nonRepeatingCharacters(str));
    }
}
