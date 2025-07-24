package NPTL;

import java.util.Scanner;
import java.util.Arrays;


public class duplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle edge case
        }

        int uniqueIndex = 0; // Index to place the next unique element

        Arrays.sort(nums); 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move to the next position for unique elements
                nums[uniqueIndex] = nums[i]; // Place the unique element
            }
        }

        return uniqueIndex; // Length of the array with unique elements
    }
    public static void main(String[] args) {
        int[] nums = {1, 1,1};
        int newLength = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
