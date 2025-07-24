package day7;

import day4.condition;

public class varargs {
    public static void main(String[] args) {
        System.out.println("varargs means variable argument tutorial");

        // int c = sum(2,4,5,8);
        // System.out.println(c);


        int c = sum (2 );  //empty varargs
        System.out.println(c);
    }


    // static int sum(int  ...arr){
    //     int sum = 0;
    //     for (int i : arr) {
    //         sum += i;
    //     }
    //     return sum;
    // }



    static int sum(int x,int  ...arr){
        int sum = x;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}
