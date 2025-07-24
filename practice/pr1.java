package practice;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number :");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(a+b+c);
        // System.out.println(++a);
        // System.out.println(a++);

        // String name = "Rahul";
        // String name = new String("Rahul");
        // System.out.println(name.length());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.trim());
        // System.out.println(name.replace("ahul","mahale"));
        // System.out.println(name.indexOf("a"));
        // System.out.println(name.charAt(2));
        // System.out.println(name.endsWith("l"));
        // System.out.println(name.equals("Rahul"));
        // System.out.println(name.equalsIgnoreCase("rahul"));

        // if(a>b && a>c){
        //     System.out.printf("%d is greater\n",a);
        // }else if(b>a && b>c){
        //     System.out.printf("%d is greater\n",b);
        // }else{
        //     System.out.printf("%d is greater\n",c);
        // }

        // switch(a){
        //     case 1:
        //         System.out.println("condition 1");
        //         break;
        //     case 2:
        //         System.out.println("condition 2");
        //     default:
        //         System.out.println("Default condition");
        // }

        // int n = 0;
        // while (n < 10) {
        //     System.out.println(n);
        //     n++;
        // }
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }
        // do{
        //     System.out.println(n);
        //     n--;
        // }while(n>0);
        
        // for (int i = 5; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int [][] arr = new int[3][2];
        // arr[0]=12;
        // arr[2]=10;
        // System.out.println(arr[2]);
        // System.out.println(arr[1].length);

        // int n = 1;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.printf("Enter a %d number : ",n);
        //         n++;
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int num : arr[i]) {
        //         System.out.println(num);
        //     }
        // }

        // int [] ar = {11,43,25,774,2,46,2,14,42,36,32,477,33};
        // int min = ar[0];
        // int sort=0;
        // for (int i = 0; i < ar.length; i++) {
        //     if(ar[i]<min){
        //         min=ar[i];
        //         sort++;
        //     }
        // }
        // System.out.println("Minimum element is array is "+min);
        // if(sort==0){
        //     System.out.println("Given array is sorted");
        // }else{
        //     System.out.println("Given array is not sorted");
        // }
        // for (int i = 0; i < ar.length; i++) {
        //     for (int j = 0; j < ar.length-1; j++) {
        //         if(ar[j]>ar[j+1]){
        //             int temp = ar[j];
        //             ar[j] = ar[j+1];
        //             ar[j+1] = temp;
        //         }
        //     }
        // }
        // for (int i : ar) {
        //     System.out.println(i);
        // }
        
        // int a = 12;
        // System.out.println(sum(a,23));
        // System.out.println(a);
        // pr1 obj = new pr1();
        // System.out.println(obj.mul(12,12));

        // sum(12,12,13,14,15,15,16,16);

        // System.out.printf("Factorial of given number is %d",fact(5));

        // fibonacci(6);

    }
    // static int sum(int a , int b){
    //     a++;
    //     return a+b;
    // }
    // public int mul(int a , int b){
    //     return a * b ;
    // }
    
    // static void sum(int ...arr){
    //     int sum = 0 ; 
    //     for (int i : arr) {
    //         sum+=i;
    //     }
    //     System.out.println(sum);
    // }

    // static int fact(int a){
    //     if(a<2){
    //         return 1;
    //     }else{
    //         return a*fact(a-1);
    //     }
    // }

    // static void fibonacci(int n){
    //     int a=0;
    //     int b=1;
    //     int c=0;
    //     while(n>c){
    //         System.out.println(c);
    //         a=b;
    //         b=c;
    //         c=a+b;
    //     }
    // }

    // static void fibonacci(int n){
    //     int a=0;
    //     int b=1;
    //     int c=0;
    //     int count=1;
    //     while(n>count){
    //         a=b;
    //         b=c;
    //         c=a+b;
    //         count++;
    //     }
    //     System.out.println(c);
    // }
}
