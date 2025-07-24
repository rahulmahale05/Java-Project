package practice;

import java.util.Scanner;

import day11.abstractclass;

class Employee{
    int a = 12;
    Employee(){
        System.out.println("I am a Empoyee");
    }
    Employee(String name){
        System.out.println(name);
    }
    void show(int a){
        this.a=a;
        System.out.println(a);
    }
    void show(){
        System.out.println(a);
    }
}
class person extends Employee{
    person(){
        System.out.println("I am a person");
    }
    void show(){
        super.show();
        System.out.println("My name is Rahul");
    }
    void Rahul(){
        System.out.println("I am a king");
    }
}

public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee("Rahul");
        e.show(15);
        e.show();

        person p = new person();
        p.show();

        Employee ep = new person();
        ep.show();
        ep.show(14);

        Myname n = new Myname();
        n.show();

        lamborgini l = new lamborgini();
        l.carname();
        
    }
}

abstract class name{
    abstract void show();
}

class Myname extends name{
    void show(){
        System.out.println("My name is Rahul");
    }
}

interface car{
    void carname();
}
class lamborgini implements car{
    public void carname(){
        System.out.println("Lamborgini");
    }
}
