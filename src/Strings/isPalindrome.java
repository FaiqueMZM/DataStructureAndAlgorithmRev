package Strings;

// check if a string a palindrome

public class isPalindrome {

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "apple";

        System.out.println("Is " + str1 + " a palindrome : " + isPalindrome(str1));
        System.out.println("Is " + str2 + " a palindrome : " + isPalindrome(str2));
    }
}
