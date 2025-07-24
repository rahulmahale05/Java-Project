package DSA.day12;

public class ProductOfArray {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int n = a.length;
        int ans [] = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1]*a[i-1];
        }
        int suffix = 1;
        for (int i = n-2; i >= 0; i--) {
            suffix *= a[i+1];
            ans[i]*=suffix;
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
