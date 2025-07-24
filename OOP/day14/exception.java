package day14;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter last number : ");
//     int n = sc.nextInt();
//     int i;
//     int k=0;
//     int j ;
//     for(j=1;j<=n;j++){
//     k=0;
//     for(i=1;i<=j;i++){
//         if(j%i==0){
//             k++;
//         }
//     }
//     if(k==2){
//         System.out.println(j);
//     }
// }
        int a = 12;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Can not divide by zero");
            System.out.println(e);
        }

    }
}
