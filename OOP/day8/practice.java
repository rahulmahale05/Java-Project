package day8;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //create class employee

        /*
        employee1 emp = new employee1();


        emp.salary = 60000;
        emp.setname("Rahul");


        System.out.println(emp.getname());
        System.out.println(emp.getsalary());
    }

     */

     //create class cellphone to print ringing vibrating
    
        // cellphone fe = new cellphone();
        // fe.ring();
        // fe.vibrat();


        //create square


        square sq = new square();
        sq.side = sq.intialize();
        sq.area(sq.side);
        sq.perimeter(sq.side);



    }
}


//create class employee
/*
class employee1{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}

 */



      //create class cellphone to print ringing vibrating

// class cellphone{
//     public void ring(){
//         System.out.println("Ringing.....");
//     }
//     public void vibrat(){
//         System.out.println("vibrating..... ");
//     }
// }




        //create square

        

class square{
    
    int side;
    
    public int intialize(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a side : ");
        side = sca.nextInt();
        return side;
    }
    public void area(int n){
        System.out.println("The area of square is "+ n*n);
    }
    public void perimeter(int n){
        System.out.println("The perimeter of square is "+2*(n+n));
    }



}