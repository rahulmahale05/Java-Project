package day6;

import java.util.Scanner;

public class arrayfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int [] marks = {98,45,78,97,80};
        // float [] marks = {98.5f,45.5f,78.5f,97,80};
        // String [] marks = {"Rahul","Rajesh","Mahale"};
        // System.out.println(marks.length);
        // System.out.println(marks[2]);

        //Displaying array

        int [] marks = new int [5];
        for (int i=0;i<5;i++){
            System.out.print("Enter a marks : ");
            marks[i] = sc.nextInt();
        }
        // for (int i=0;i<marks.length;i++){
        //     System.out.println("Marks of student "+(i+1)+" are : "+marks[i]);
        // }

        // //for reverse order
        // for (int i=marks.length-1;i>=0;i--){
        //     System.out.println("Marks of student "+(i+1)+" are : "+marks[i]);
        // }


        // displaying the array using for each loop 
        for(int element : marks){
            System.out.println(element);
        }
    }
}
