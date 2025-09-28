package day8;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        prime p = new prime();
        System.out.print("Enter a number : ");

        int n=sc.nextInt();
        for(int j=2;j<=n;j++){
            p.primeno(j);
            if (p.primeno(j)) 
                System.out.println(j);  
        }
    

        // int a = p.primeno(p.n);
        // System.out.println(a);

    }
}
class prime{
    // int n;
    // public void primeno(int n){
    //     int num=0;
    //     if(n==1)
    //         System.out.println("1 is composite number ");
    //     else {
    //         for(int i=1;i<n;i++){
    //             if(n%i==0)
    //              num++;
    //         }
    //     }
        // if(num==2)
        //     System.out.println("The given number is prime");
        // else 
        //     System.out.println("The given number is not prime");

    // }
    public boolean primeno(int n){        
            for(int i=2;i<n;i++){
                if(n%i==0)
                   return false;
            }
        return true;
    }
}
