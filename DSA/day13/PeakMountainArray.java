package DSA.day13;

public class PeakMountainArray {
    public static void main(String[] args) {
        int a[] ={0,3,8,9,5,2};
        int s = 1;
        int e = a.length-2;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(a[mid-1]<a[mid] && a[mid]>a[mid+1]){
                System.out.println(a[mid]);
                break;
            }
            if(a[mid-1]<a[mid]){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
    }
}
