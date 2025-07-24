package DSA.day12;

public class PowXn {
    public static void main(String[] args) {
        int x = 4;
        int n = -5;
        if(n<0){
            x = 1/x;
            n = -n;
        }
        double ans =1;
        while(n>0){
            if(n%2 == 1){
                ans *= x;
            }
            x = x*x;
            n/=2;
        }
        System.out.println(ans);
    }
}
