package Arrays;

//find the largest number in an integer array

import java.util.Arrays;

public class findLargestNumber {

    public static int findLargest(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {4,8,2,7,1,5,6};
        System.out.println("Find the largest number in the array " + Arrays.toString(nums) + "  ==>  " + findLargest(nums));
        System.out.println();
    }
}
