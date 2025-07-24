package DSA.day13;

public class Merge2sortedArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,0,0,0};
        int b[] = {2,5,6};
        int ind = a.length-1;
        int i = a.length-b.length-1;
        int j = b.length-1;

        while (i>=0 && j>=0) {
            if(a[i]<b[j]){
                a[ind--]=b[j--];
            }else{
                a[ind--]=a[i--];
            }
        }
        while (j>=0) {
            a[ind--]=b[j--];
        }
        // int m = a.length;
        // int ind1 = a.length-b.length-1;
        // int ind2 = b.length-1;
        // for (int i = m-1; i >= 0; i--) {
        //     if(ind2<0) break;
        //     if(a[ind1]<b[ind2]){
        //         a[i]=b[ind2--];
        //     }else{
        //         a[i]=a[ind1--];
        //     }
        // }
        for (int val : a) {
            System.out.print(val+" ");
        }
    }
}
