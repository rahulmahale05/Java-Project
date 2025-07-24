package day1;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] a=new int[5];
        // a[0] =12;                //values are known as literals
        // a[2] =22;
        // a[3] =32;
        // a[4] =42;
        // a[1] =52;
        // for(int i=0;i<5;i++){
        //     System.out.println("Marks"+a[i]);
        //     // int a[i]=sc.nextInt();
        // }
        // String b="Rahul";
        // System.out.println(b);
    //     boolean a=sc.hasNextInt();

    //     System.out.println(a);
    // System.out.println("Enter Math Marks");
    // int math =sc.nextInt();
    // System.out.println("Enter English Marks");
    // int english =sc.nextInt();
    // System.out.println("Enter Scinece Marks");
    // int science =sc.nextInt();
    // System.out.println("Enter History Marks");
    // int history =sc.nextInt();
    // System.out.println("Enter Marathi Marks");
    // int marathi =sc.nextInt();
    // float total = math+english+science+history+marathi;
    // System.out.println("Total : "+total);
    // float Average = total/5;
    // System.out.println("Average : "+Average);
    Average a = new Average();
    a.avg();
    }
    public void avg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Math Marks");
        int math =sc.nextInt();
        System.out.println("Enter English Marks");
        int english =sc.nextInt();
        System.out.println("Enter Scinece Marks");
        int science =sc.nextInt();
        System.out.println("Enter History Marks");
        int history =sc.nextInt();
        System.out.println("Enter Marathi Marks");
        int marathi =sc.nextInt();
        float total = math+english+science+history+marathi;
        System.out.println("Total : "+total);
        float Average = total/5;
        System.out.println("Average : "+Average);
    }
}
