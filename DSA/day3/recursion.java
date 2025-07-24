package DSA.day3;

public class recursion {
    public static void main(String[] args) {
    // printnum(5);
    // System.out.println(sum(10));
    // printFactorial(6, 1);
    // printFactorial(0, 1, 5);
    }
    
    //Q1. Print numbers from 5 to 1.

    // public static void printnum(int n){
    //     if(n==0){
    //         return;
    //     }
    //     else{
    //         System.out.println(n);
    //         printnum(n-1);
    //     }
    // }

    //Q2. Print numbers from 1 to 5.

    // public static void printNumbers(int n) {
    //     if(n == 6) {
    //     return;
    //     }
    //     System.out.println(n);
    //     printNumbers(n+1);
    //     }

    //Q3. Print the sum of first n natural numbers.

    // public static int sum(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     else{
    //         return n+sum(n-1);
    //     }
    // }

    //or

    // public static void printSum(int n, int sum) {
    //     if(n == 0 || n==1) {
    //     System.out.println(sum);
    //     return;
    //     }
    //     sum += n;
    //     printSum(n-1, sum);
    //     }

    //Q4. Print factorial of a number n.

    // public static void printFactorial(int n, int fact) {
    //     if(n == 0 || m==1) {
    //     System.out.println(fact);
    //     return;
    //     }
    //     fact *= n;
    //     printFactorial(n-1, fact);
    //     }

    //Q5. Print the fibonacci sequence till nth term.

//     public static void fibonacci(int a, int b, int n) {
//         if(n == 0) {
//         return;
//         }
//         System.out.println(a);
//         fibonacci(b, a+b, n-1);
// }

    //Q6. Print x^n (with stack height = n)

    // public static int printPower(int x, int n) {
    //     if(n == 0) {
    //     return 1;
    //     }
    //     if(x == 0) {
    //     return 0;
    //     }
    //     int x_ = printPower(x, n-1);
    //     int xn = x * x_;
    //     return xn;
    // }

    //Q7. Print x^n (with stack height = logn)

    // public static int printPower(int x, int n) {
    //     if(n == 0) {
    //     return 1;
    //     }
    //     if(n % 2 == 0) {
    //     return printPower(x, n/2) * printPower(x, n/2);
    //     }
    //     else {
    //     return x * printPower(x, n/2) * printPower(x, n/2);
    //     }
    //     }
    
}
