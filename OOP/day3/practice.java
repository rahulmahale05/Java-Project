package day3;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //problem 1

        String name = sc.nextLine();
        System.out.println(name.toLowerCase());

        //problem 2

        System.out.println(name.replace(" ","_"));

        //problem 3

        String letter = "Dear <|name|> , Thanks a lot";
        System.out.println(letter.replace("<|name|>","Rahul"));

        //problem 4

        String a = "I Am  Devil of My World";
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));

        //problem 5

        String b = "Dear Rahul, \n\tThis course is so nice. \n\tThanks";
        System.out.println(b);
    }
}
