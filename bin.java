
import java.util.Scanner;
import java.util.ArrayList;
import day14.exception;

public class bin {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(9);
        System.out.println(a);
        // Declare variables to store decimal number, quotient, and an array for binary
        // digits
        // int dec_num, quot, i = 1, j;
        // int bin_num[] = new int[100];

        // // Create a Scanner object to read input from the user
        // Scanner scan = new Scanner(System.in);

        // // Prompt the user to input a decimal number
        // // System.out.print("Input a Decimal Number: ");
        // dec_num = scan.nextInt();

        // // Initialize the quotient with the decimal number
        // quot = dec_num;


        // // Display the binary representation of the decimal number
        // System.out.print("Binary number is: ");
        // for (j = i - 1; j > 0; j--) {
        //     System.out.print(bin_num[j]);
        // }
        //System.out.print("\n");
        // int a = 5;
        // char a = 'A';
        // System.out.println(a++);
        // System.out.println(a);
        // System.out.println(++a);
        // Scanner sc = new Scanner(System.in);
        // String a ;
        // a = sc.next();
        // switch (a) {
        //     case "add":
        //         System.out.println("add");
        //         break;
        
        //     default:
        //         System.out.println("There is default statement ");
        //         break;
        // }
        // int [] a = new int[5];
        // int [] b ={12,23,34,45};
        // // String c = "Rahul";
        // // // System.out.println(a);
        // // System.out.println(b.length);
        // // System.out.println(c.length());

        // // for(int i = b.length-1 ; i>=0 ; i--){
        // //     System.out.println(b[i]);
        // // }
        // for (int i : b) {
        //     System.out.println(i);
        // }
        // bin c = new bin();
        // c.rahul();
        // foo(7,8,9,0,76,5,3);
        // int a = factorial(6);
        // System.out.println(a);
        // myclass a = new myclass(12);
        // a.pr();
        // try{
        //     int c=3;
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }
        ra(12);
    }
    // int rahul(){
    //     System.out.println("My name is rahul");
    //     return 1;
    // }
    // public static void foo(int ...arr){
    //     for (int i : arr) {
    //         System.out.println(i);
    //     }
    // }
    // static int factorial(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     else {
    //         return n*factorial(n-1);
    //     }
    // }
    
    static void ra(int a) throws ArithmeticException{
        System.out.println(a/0);
    }
}

// vector<int> myvec=new vector<int>;
// myvec.push_back(33);
// myvec.push_back(23);

// class myclass{
//     int id ; 
//     public myclass(int id){
//         this.id = id;
        
//     }
//     void pr(){
//         System.out.println(id);
//     }
   
// }