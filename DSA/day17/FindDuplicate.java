package DSA.day17;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {2,5,9,6,9,3,8,9,7,1};
        int n = arr.length-1;
        /*Time Complexity = O(n) Space Complexity = O(n) */
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if(set.contains(arr[i])){
        //         System.out.println(arr[i]);
        //         break;
        //     }
        //     set.add(arr[i]);
        // }

        int slow = arr[0];
        int fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        System.out.println(slow);
    }
}
