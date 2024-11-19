package Arrays;

//find the second smallest number in an integer array

import java.util.Arrays;

public class findSecondSmallestNumber {

    public static int secondSmallest(int[] nums) {
        int smallest = Integer.MIN_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {         //can use for-each loop     for (int i : nums)
            if (nums[i] < smallest) {                   //use i instead of nums[i] if using for-each
                secondSmallest = smallest;
                smallest = nums[i];
            } else if (i < secondSmallest && i != smallest) {
                secondSmallest = nums[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {

        int[] nums = {1,5,2,3,4};
        System.out.println("Second smallest number " + Arrays.toString(nums) + " is " + secondSmallest(nums));
    }
}
