package DSA.day13;

public class SortArray0s1s2s {
    public static void main(String[] args) {
        int a [] = {0,2,1,1,0,1,2,0,0};
        int low = 0 ;
        int mid = 0;
        int high = a.length-1;
        while (mid<=high) {
            if(a[mid]==0){
                int temp = a[mid];
                a[mid++] = a[low];
                a[low++] = temp;
            }else if(a[mid]==1){
                mid++;
            }else{
                int temp = a[mid];
                a[mid] = a[high];
                a[high--] = temp;
            }
        }
        for (int j : a) {
            System.out.print(j+"");
        }


        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;
        // for (int i = 0; i < a.length; i++) {
        //     if(a[i] == 0) count0++;
        //     else if(a[i] == 1) count1++;
        //     else count2++;
        // }
        // int i=0;
        // for (int j = 0; j < count0; j++) {
        //     a[i++] = 0; 
        // }
        // for (int j = 0; j < count1; j++) {
        //     a[i++] = 1;
        // }
        // for (int j = 0; j < count2; j++) {
        //     a[i++] = 2;
        // }
        // for (int val : a) {
        //     System.out.print(val+" ");
        // }
    }
}
