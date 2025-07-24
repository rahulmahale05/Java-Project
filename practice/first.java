package practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// interface Rahul{
//     int a = 12;
//     void meth1();
//     void meth2();
// }
// @FunctionalInterface
// interface Rahul1{
//     void meth2();
// }

// class Rahul3<T>{
//     T a;
//     void ram(T a){
//         System.out.println(a);

//     }
// }

public class first {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //anonymous class
    // Rahul a = new Rahul() {
    //     public void meth1(){
    //         System.out.println("This is my first method "+a);
    //     }
    //     public void meth2(){
    //         System.out.println("This my second method");
    //     }

    // };
    // a.meth1();
    // a.meth2();

    // //lambda function
    // Rahul1 b = () ->{
    //     System.out.println("I am rahul mahale");
    // };
    // b.meth2();

    // Rahul3<String> a = new Rahul3<>();
    // a.ram("Rahul");




    //store multiplication table in the file 
    // int i;
    // int a;
    // a=sc.nextInt();
    // String table = "";
    // for(i=1;i<=10;i++){
    //     table+=i+"X"+a+"="+i*a;
    //     table+="\n";
    // }
    // try{
    //     FileWriter f = new FileWriter("Multiplication.txt");
    //     f.write(table);
    //     f.close();
    // }
    // catch(IOException e){
    //     System.out.println("There is an exception occurs");
    // }
    int a=65;
char c=(char)a;
System.out.println(a);
    }
}
