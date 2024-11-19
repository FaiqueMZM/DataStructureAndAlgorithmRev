package Arrays;

//find duplicate elements in an integer array

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findDuplicateElement {

    public static void findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                duplicates.add(nums[i]);
            } else {
                seen.add(nums[i]);
            }
        }
        System.out.println("Duplicates in the array " + Arrays.toString(nums) + " ==> " + duplicates);
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3,4,5};
        findDuplicate(nums);
    }
}
