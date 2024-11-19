package Arrays;

//count occurrences of an element in an integer array

import java.util.Arrays;

public class countOccurrencesOfAnElement {

    public static int countOccurrences(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,3,2,3,1,2,3,3};     //only have 1,2,3
        System.out.println("This is the array " + Arrays.toString(nums));

        System.out.println("Count of number '1' ==> " + countOccurrences(nums, 1));
        System.out.println("Count of number '2' ==> " + countOccurrences(nums, 2));
        System.out.println("Count of number '3' ==> " + countOccurrences(nums, 3));
    }
}
