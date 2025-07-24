package day4;

import java.util.*;

public class switch1 {
    public static void main(String[] args) {
        int choice;
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice) {
            case 18:
                    System.out.println("you are become to adult");
                break;
            case 21:
                System.out.println("you are going to get job");
                break;
            case 60:
                System.out.println("you are going to get retire");
                break;
            default:
                System.out.println("enjoy your life");
                break;
        }
    }
}
