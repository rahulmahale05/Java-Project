package DSA.day14;

public class bookAllocation {
    public static void main(String[] args) {
        int a [] = {10,20,30,40};
        int n = 4;
        int m = 2;
        if(n<m){  //O(n)
            System.out.println(-1);
            return;
        }
        int s = a[0];
        int e = 0;
        int ans = -1;
        for (int i = 0; i < a.length; i++) {
            e+=a[i];
            if(s<a[i]) s = a[i];
        }
        while (s<=e) {  // O(logN*n)
            int mid = s+(e-s)/2;
            if(isValid(a,n,m ,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isValid(int arr[] , int n , int m , int mid){  //O(n)
        int st = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mid) return false;
            if(pages+arr[i] <= mid){
                pages+=arr[i];
            }else{
                st++;
                pages=arr[i];
            }
        }
        if(st<=m) return true;
        else return false;
    }
}
