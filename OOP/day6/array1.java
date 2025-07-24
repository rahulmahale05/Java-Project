package day6;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int [] marks = new int [5];
        // for (int i=0;i<5;i++){
        //     System.out.print("Enter a marks : ");
        //     marks[i] = sc.nextInt();
        // }
        // for (int i=0;i<5;i++){
        //     System.out.println("Marks of student "+(i+1)+" are : "+marks[i]);
        // }


        //types of array declare

        //1. declaration and memory allocation
        // int [] marks = new int [5];

        //2 . Declaration and then memory allocation
        // int [] marks;         //declaration
        // marks = new int[1];   //memory allocation
        // marks[0] =13;         //initialization


        //1. declaration , memory allocation and initialization
        // int [] marks = {12,13,14,15,16};


        int [] marks = {12,13,14,15,16};
        System.out.println(marks[4]);
        System.out.println(marks.length);
    }
}
