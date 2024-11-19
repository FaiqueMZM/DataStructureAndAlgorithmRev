package Arrays;

//reverse an integer array

import java.util.Arrays;

public class reverseArray {

    public static int[] reverseArray(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println("Reverse of the array " + Arrays.toString(nums) + "  ==>  " + Arrays.toString(reverseArray(nums)));
    }
}
