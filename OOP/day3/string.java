package day3;

import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Different ways to print

        // String name = new String("Rahul");
        // String name = "Rahul";
        // System.out.print("My name is "+name);
        // System.out.format("My name is "+name);
        // name = sc.nextLine();
        // float a = 8.56675f;
        // System.out.printf("\nMy name is %8.3f",a);
        // System.out.println("\nMy name is "+name);

        String name = "Rahul Rajesh Mahale";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(6,12));
        System.out.println(name.replace("ahul Rajesh Mahale","mahale"));
        System.out.println(name.startsWith("Ra"));
        System.out.println(name.endsWith("el"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("Raj"));
        System.out.println(name.indexOf("R",2));
        System.out.println(name.lastIndexOf("R"));
        System.out.println(name.lastIndexOf("R",2));
        System.out.println(name.equals("Rahul"));
        System.out.println(name.equals("Rahul"));
        System.out.println(name.equalsIgnoreCase("Rahul Rajesh Mahale"));
    }
}
