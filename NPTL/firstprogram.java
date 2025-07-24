package NPTL;
//jdk 8

import java.util.Scanner;

public class firstprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Hello World");

        Rahul r = new Rahul();

        // String a = r.getname();

        // r.name(a);
        // int sum=0 ;
        // sum += Math.pow (5,2);
        // System.out.println(sum);

        r.armstrong();

    }
    
}

class Rahul{
    // String name;
    // public String getname(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Your name : ");
    //     name = sc.nextLine();
    //     return name;

    // }
    // public void name(String name){
    //     System.out.println("Your name is "+name);
    // }
    // int n ;
    // int [] arr = new int[n];

     public void armstrong(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        // armstrong(n);
        for(int i=0;i<=n;i++){
            start(i);
        }

    }
    public void start (int a){
        int num = 0;
        int n = a;
        while(n>0){
            n=n/10;
         num++;
     }
    // System.out.println(num);
    int i=1 ;
    int b;
    n = a;
    int sum =0;
    while(i<=num){
        b = n % 10 ;
        sum += Math.pow(b,num);
        n = n/10;
        i++;
    }
    if(a==sum)
        System.out.println(sum);
    else
        System.out.print("");
}


}
