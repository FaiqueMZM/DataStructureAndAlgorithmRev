package Arrays;

//find the largest number in an integer array

import java.util.Arrays;

public class findLargestNumber {

    public static int findLargest(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {     //can use for-each loop   for(int i : nums)
            if (nums[i] > max) {                    //can use i instead of nums[i] if using for-each
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
