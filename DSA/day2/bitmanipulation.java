package DSA.day2;

import java.util.Scanner;

public class bitmanipulation {
    public static void main(String[] args) {
    // int n = 5;
    // int pos = 2;
    // int bitMask = 1<<pos;

    //get bit

    // if((bitMask & n)==0){
    //     System.out.println("bit was zero");
    // }
    // else{
    //     System.out.println("bit was one");
    // }

    //set bit

    // int newNumber=bitMask | n;
    // System.out.println(newNumber);

    //clear bit 

    // int newBitMask = ~(bitMask);
    // int newNumber = newBitMask & n;
    // System.out.println(newNumber);

    //update bit

//     Scanner sc = new Scanner(System.in);
//     int oper = sc.nextInt();
//     // oper=1 -> set; oper=0 -> clear
//    int n = 5;
//    int pos = 1;
  
//    int bitMask = 1<<pos;
//    if(oper == 1) {
//        //set
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);
//    } else {
//     //clear
//     int newBitMask = ~(bitMask);
//     int newNumber = newBitMask & n;
//     System.out.println(newNumber);
//    }


        // int n = 15;
        // decimaltobinary(n);
        int p=101;
        String m = Integer.toString(p);
        // binarytodecimal(m);


    }
    static void decimaltobinary(int n){
        String a = "";
        while(n!=0){
            int b = n%2;
            a+=Integer.toString(b);
            n=n/2;
        }
        System.out.println(a);
    }
    // static void binarytodecimal(String m){
    //     int num = 0;
    //     for (int i = 0; i < m.length(); i++) {
    //         num+=(m.charAt(m.length()-i-1))*Math.pow(2, i);
    //     }
    //     System.out.println(num);
    // }
    // static void getbit(){
        
    // }
    
}
