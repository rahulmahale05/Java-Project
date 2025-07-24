package DSA.day14;

public class painterPartition {
    public static void main(String[] args) {
        int arr [] = {40,30,10,20};
        int n = 4;
        int m = 3;
        if(n<m){
            System.out.println(-1);
            return;
        }
        int s = arr[0];
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            e+=arr[i];
            if(s<arr[i]) s = arr[i];
        }
        int ans = -1;
        while (s<=e) {
            int mid = s + (e-s)/2;
            if(isValid(arr,n,m,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isValid(int arr[] , int n , int m , int mid){
        int painter = 1;
        int board = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mid) return false;
            if(board+arr[i]<=mid){
                board+=arr[i];
            }else{
                painter++;
                board = arr[i];
            }
        }
        if(painter<=m) return true;
        else return false;
    }
}
