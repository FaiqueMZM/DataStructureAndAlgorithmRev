package Strings;

// reverse a given string

public class reverseString {

    public static void reverseString(String str) {
        char[] strArr = str.toCharArray();

        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i]);
        }
    }

    public static String reverseString1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String str = "abcd";

        System.out.print("Reverse of string 'abcd' is : ");
        reverseString(str);
        System.out.println();

        System.out.print("Reverse of string 'abcd' is : " + reverseString1(str));
    }
}
