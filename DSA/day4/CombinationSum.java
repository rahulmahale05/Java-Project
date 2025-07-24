package DSA.day4;

import java.util.ArrayList;
import java.util.HashSet;

public class CombinationSum {
    public static void helper(int arr[], int tar, HashSet<ArrayList<Integer>> ans, ArrayList<Integer> comb, int i) {
        if (i == arr.length || tar < 0) return;

        if (tar == 0) {
            ans.add(new ArrayList<>(comb)); // copy
            return;
        }

        // Include current element once
        comb.add(arr[i]);
        helper(arr, tar - arr[i], ans, comb, i + 1);

        // Include current element multiple times
        helper(arr, tar - arr[i], ans, comb, i);

        // Exclude current element (backtrack)
        comb.remove(comb.size() - 1); // correct way to backtrack
        helper(arr, tar, ans, comb, i + 1);
    }

    public static HashSet<ArrayList<Integer>> combSum(int arr[], int tar) {
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        ArrayList<Integer> comb = new ArrayList<>();
        helper(arr, tar, ans, comb, 0);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5};
        int tar = 8;
        System.out.println(combSum(arr, tar));
    }
}
