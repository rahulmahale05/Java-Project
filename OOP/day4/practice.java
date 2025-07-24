package day4;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        //question 1

        //  int sub1,sub2,sub3;
        // System.out.print("Enter subject marks : ");
        // Scanner sc = new Scanner(System.in);
        // sub1 = sc.nextInt();
        // sub2 = sc.nextInt();
        // sub3 = sc.nextInt();
        // float total = (sub1+sub2+sub3)/3.0f;
        // if(sub1>=33&&sub2>=33&&sub3>=33&&total>=40)
        //         System.out.println("Student is pass");
        //     else
        //         System.out.println("Student is fail");

        //question 2

        // int income;
        // System.out.print("Enter your income : ");
        // Scanner sc = new Scanner(System.in);
        // income = sc.nextInt();
        // int tax;
        // if(income>250000&&income<500000){
        //     tax = income*5/100;
        //     System.out.println("you have to pay tax rs"+tax);
        // }
        // else if(income>500000&&income<1000000){
        //     tax = income*20/100;
        //     System.out.println("you have to pay tax rs"+tax);
        // }
        // else if(income>1000000){
        //     tax = income*30/100;
        //     System.out.println("you have to pay tax rs"+tax);
        // }
        // else
        //     System.out.println("you does not have need to pay tax");

        //question 3

        // int num;
        // System.out.print("Enter day numer from 1 to 7 : ");
        // Scanner sc = new Scanner(System.in);
        // num = sc.nextInt();
        // switch (num) {
        //     case 1:
        //             System.out.println("Today is Monday");
        //         break;
        //     case 2:
        //             System.out.println("Today is Tuesday");
        //         break;
        //     case 3:
        //             System.out.println("Today is Wednesday");
        //         break;
        //     case 4:
        //             System.out.println("Today is Thusday");
        //         break;
        //     case 5:
        //             System.out.println("Today is Friday");
        //         break;
        //     case 6:
        //             System.out.println("Today is Saturday");
        //         break;
        //     case 7:
        //             System.out.println("Today is Sunday");
        //         break;
        
        //     default:
        //             System.out.println("There are only seven day in week \nPlease select from 1 to 7");
        //         break;
        // }

        //question 4

        // int year;
        // System.out.print("Enter year : ");
        // Scanner sc = new Scanner(System.in);
        // year = sc.nextInt();
        // if(year%4==0){
        //     System.out.println("The given year is leap year");
        // }
        // else
        //     System.out.println("The given year is not leaf year");


        //switch difeent syntax without using brake

        // int num;
        // System.out.print("Enter day numer from 1 to 7 : ");
        // Scanner sc = new Scanner(System.in);
        // num = sc.nextInt();
        // switch (num) {
        //     case 1 -> System.out.println("Today is Monday");
        //     case 2 -> System.out.println("Today is Tuesday");
        //     case 3 -> System.out.println("Today is Wednesday");
        //     case 4 -> System.out.println("Today is Thusday");
        //     case 5 -> System.out.println("Today is Friday");
        //     case 6 -> System.out.println("Today is Saturday");
        //     case 7 -> System.out.println("Today is Sunday");
        //     default-> System.out.println("There are only seven day in week \nPlease select from 1 to 7");    
        // }

        //question 5
        
        String website;
        System.out.print("Enter website : ");
        Scanner sc = new Scanner(System.in);
        website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("The given website is commercial website");
        }
        else  if(website.endsWith(".org")){
            System.out.println("The given website is Organization website");
        }
        else  if(website.endsWith(".in")){
            System.out.println("The given website is Indian website");
        }
        else
            System.out.println("Website type is different");
    }
}
