package Strings;

// count occurrence of a character in a string

public class countOccurrence {

    public static int countOccurrences(String str, char ch ) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "aeroplane";
        char ch = 'a';

        System.out.println("Number of a's in '" + str + "' : " + countOccurrences(str, ch));
    }
}
