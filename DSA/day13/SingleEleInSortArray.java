package DSA.day13;

public class SingleEleInSortArray {
    public static void main(String[] args) {
        int a[] = {8,8,9};
        // for (int i = 1; i < a.length; i+=2) {
        //     if(a[i]!=a[i-1]){
        //         System.out.println(a[i-1]);
        //         break;
        //     }
        // }
        int s = 0;
        int e = a.length-1;
        int n = a.length;
        if(a.length==1) {
            System.out.println(a[0]);
        }
        while (s<=e) {
            int mid = s+(e-s)/2;

            if(mid == 0 && a[0] != a[1]) {
                System.out.println(a[mid]);
                break;
            }
            if(mid == n-1 && a[n-1] != a[n-2]) {
                System.out.println(a[mid]);
                break;
            }
            if(a[mid-1]!=a[mid] && a[mid]!=a[mid+1]){
                System.out.println(a[mid]);
                break;
            }
            if(mid%2==0){
                if(a[mid-1]==a[mid]){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
            else {
                if(a[mid-1]==a[mid]){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }
        }
    }
}
