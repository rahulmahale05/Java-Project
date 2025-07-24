import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //convert binary to Decimal

        // int a  = sc.nextInt();
        // int num=0;
        // int n=0;
        // while(a>0){
        //     int i = a%10;
        //     num+=(i*Math.pow(2,n));
        //     n++;
        //     a/=10;
        // }
        // System.out.println(num);

        //Converth Decimal to Binary
        
        // int a = sc.nextInt();
        // StringBuilder sb = new StringBuilder();
        // while(a>0){
        //     int i = a%2;
        //     sb.insert(0,i);
        //     a/=2;
        // }
        // System.out.println(sb);

        // int n = 10;
        // int a=0;
        // int b=1;
        // int c=0;
        // for(int i=1;i<=n;i++){
        //     System.out.println(c);
        //     a=b;
        //     b=c;
        //     c=a+b;
        // }

        //GCD

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // while(b!=0){
        //     int c=a;
        //     a=b;
        //     b=c%b;
        // }
        // System.out.println(a);

        //Bubble sort

        // int a[] = {13,34,3,33,78,56,43,99,64,35};

        // for (int i = 0; i < a.length-1; i++) {
        //     for (int j = 0; j < a.length-i-1; j++) {
        //         if(a[j]>a[j+1]){
        //             int temp = a[j];
        //             a[j] = a[j+1];
        //             a[j+1] = temp;
        //         }
        //     }
        // }
        // for (int i : a) {
        //     System.out.print(i+" ");
        // }

        //Selection sort
        
        // int a[] = {13,34,3,33,78,56,43,99,64,35};

        // for (int i = 0; i < a.length; i++) {
        //     int smallest = i;
        //     for (int j = i+1; j < a.length; j++) {
        //         if(a[smallest]>a[j]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = a[i];
        //     a[i] = a[smallest];
        //     a[smallest] = temp;
        // }
        // for (int i : a) {
        //     System.out.print(i+" ");
        // }

        //Insertion sort

        // int a[] = {13,34,3,33,78,56,43,99,64,35};

        // for (int i = 1; i < a.length; i++) {
        //     int current = a[i];
        //     int j=i-1;
        //     while(j>=0 && a[j]>current){
        //         a[j+1]=a[j];
        //         j--;
        //     }
        //     a[j+1] = current;
        // }
        // for (int i : a) {
        //     System.out.print(i+" ");
        // }

    }
}
