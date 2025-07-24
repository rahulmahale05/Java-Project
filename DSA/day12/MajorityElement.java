package DSA.day12;

public class MajorityElement {
    public static void main(String[] args) {
        //Moore's Algorithm
        int a[] = {1,2,4,1,2,1,1};
        int freq = 0;
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            if(freq == 0){
                ans = a[i];
            }
            if(ans == a[i]){
                freq++;
            }else{
                freq--;
            }
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(ans == a[i]) count++;
        }
        if(count>a.length/2) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
