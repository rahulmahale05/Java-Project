import java.util.*;

public class pattern {
    public static void main(String[] args){
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=i;j++)
            System.out.print("*");
            
        }
        // int a=12;
        // int b=sizeof(a);
        // System.out.println(b);
        int[] a=new int[3];
        a[0]=5;
        a[1]=3;
        a[2]=2;
        for (int k=0;k<3;k++){
            System.out.println(a[k]);
        }
    }
}
