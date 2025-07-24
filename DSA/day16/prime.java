package DSA.day16;

public class prime {
    public static void main(String[] args) {
        //Math Problems
        // int  range = 5;
        // int count = 0;
        // for (int i = 2; i < range; i++) {
        //     if(isPrime(i)) count++;
        // }
        // System.out.println(count);

        int n = 10;
        boolean isPrime[] = new boolean[n+1];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int count=0;
        for (int i = 2; i < n; i++) {
            if(isPrime[i]){
                count++;
                for (int j = i+2; j < n; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(count);
    }
    // public static boolean isPrime(int a){
    //     for (int i = 2; i*i <= a; i++) {
    //         if(a%i==0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
