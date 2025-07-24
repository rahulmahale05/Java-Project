package DSA.day17;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        int tar = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                if(nums[i]+nums[j]+nums[k] == tar){
                    System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                    j++;k--;
                    while (j<k && nums[j] == nums[j-1]) j++;
                }
                else if(nums[i]+nums[j]+nums[k] < tar) j++;
                else k--;
            }
        }
    }
}
