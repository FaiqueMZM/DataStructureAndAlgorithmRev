package Strings;

// count vowels in a given string

public class countVowels {

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(char c : str.toCharArray()){
            if(vowels.indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "aeroplane";

        System.out.println("Number of vowels in '" + str + "' : " + countVowels(str));
    }
}
