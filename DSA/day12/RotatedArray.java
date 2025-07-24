package DSA.day12;

public class RotatedArray {
    public static void main(String[] args) {
        int a[] = {3,4,5,6,7,8,0,1,2};
        int tar = 0;
        int s = 0 ;
        int e = a.length-1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(tar == a[mid]){
                System.out.println(mid);
                break;
            }
            if(a[s]<=a[mid]){
                if(a[s]<=tar && tar<=a[mid]){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }else{
                if(a[mid+1]<=tar && tar<=a[e]){
                    s = mid+1;
                }else {
                    e = mid-1;
                }
            }
        }
    }
}
