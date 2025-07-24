package day9;

import java.util.Scanner;

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        name1 n = new name1("Rahul Mahale");
        name1 r = new name1();

        n.getname();
        r.getname();
    }
    
}


class name1{
    private String name;

    //Default constructor


    public name1(){
        name = "Rahul";
    }


    //Parameterized contructor


    public name1(String n){
        name = n;
    }

    public void getname(){
        System.out.println(name);
    }
}
