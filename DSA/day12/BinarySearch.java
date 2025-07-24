package DSA.day12;

public class BinarySearch {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9};
        int tar = 6;
        int s = 0 , e = a.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(tar<a[mid]) e = mid-1;
            else if(tar>a[mid]) s = mid+1;
            else{
                System.out.println(mid);
                break;
            }
        }
    }
}
