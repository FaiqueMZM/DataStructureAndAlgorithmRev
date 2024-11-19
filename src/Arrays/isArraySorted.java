package Arrays;

//check if the array is sorted

import java.util.Arrays;

public class isArraySorted {

    public static boolean isSorted(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,3,5,6};
        int[] nums3 = {4,3,6,3,7};

        System.out.println("Is this array sorted" + Arrays.toString(nums1) + "  ==>  " + isSorted(nums1));
        System.out.println("Is this array sorted" + Arrays.toString(nums2) + "  ==>  " + isSorted(nums2));
        System.out.println("Is this array sorted" + Arrays.toString(nums3) + "  ==>  " + isSorted(nums3));

    }
}
