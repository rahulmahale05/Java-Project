package DSA.day16;

public class GCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        while (a>0) {
            int temp = a;
            a = b%a;
            b = temp;
        }
        System.out.println(b);
        System.out.println(20*30/b);
    }
}
