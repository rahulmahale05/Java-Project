package day9;

import java.util.Scanner;

class my{
    private int id;
    private String name;

    public String getname(){
        return name;
    }
    public void setname(String n){
        // name = n;
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        // id = i;
        this.id = i;
    }
}

public class access_specifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        my m = new my();

        m.setname("Rahul Mahale");
        System.out.println(m.getname());

        m.setId(45);
        System.out.println(m.getId());

        // m.id = 45;
        // m.name = "Rahul";     //Throw an error due to private access modifiers


    }
    
}
