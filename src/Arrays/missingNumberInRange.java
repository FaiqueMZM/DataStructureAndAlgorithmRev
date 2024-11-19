package Arrays;

//find missing number in a series range

import java.util.Arrays;

public class missingNumberInRange {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int totalSum = n * (n+1) / 2;
        int arraySum = 0;
        for (int i = 0; i < nums.length; i++) {             //can use for-each loop     int (int i : nums)
            arraySum += nums[i];                            //use i instead of nums[i] if using for-each
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,6,7,8,9,10,11,12};                  //don't have to be sorted
        System.out.println("Find missing number in the array " + Arrays.toString(nums) + " : " + findMissingNumber(nums));
    }
}
