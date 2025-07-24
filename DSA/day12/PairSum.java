package DSA.day12;

public class PairSum {
    public static void main(String[] args) {
        int a[] = {2,4,6,7,8,9};
        int tar = 9;
        int s = 0 , e = a.length-1;
        while (s<e) {
            int sum = a[s]+a[e];
            if(sum>tar) e--;
            else if(sum<tar) s++;
            else{
                System.out.println(a[s]+"  "+a[e]);
                break;
            }
        }
    }
}
