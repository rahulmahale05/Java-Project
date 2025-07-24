package day8;

import java.util.Scanner;

public class oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        employee rahul = new employee();        //Instantiating a new employee object
        employee ram = new employee();
        //setting properties/Properties

        rahul.id = 12;
        rahul.name = "Rahul Mahale";

        ram.id = 13;
        ram.name = "Ramprasad";

        //Printing the attributes
        // System.out.println(rahul.id);
        // System.out.println(rahul.name);
        // System.out.println(ram.id);


        rahul.printdetails();
        ram.printdetails();
    }
    
}

class employee{
    // int id = 34 ;
    int id;
    String name ;
    public void printdetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+name);
    }
}
