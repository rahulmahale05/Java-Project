package day9;

import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n***************************Welcome to the number guessing game!***************************");
        System.out.println("\nI'm thinking of a number between 1 and 100.");

        guess g = new guess();

        try{
            g.score();
        }catch(Exception e){
            System.out.println("Choice must be an Integer");
        }
        System.out.println();
        System.out.print("\nDo you want to play again? (y/n): ");
        String response = sc.next();

        
        if (response.equalsIgnoreCase("y")) {
            g.score();
        } else {
            System.out.println("\n***************************Thanks for playing!***************************");
        }

    }
    
}

class guess {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int gnum;
    int usernum;
    int score = 0;
    int attempts = 0;

    public guess(){
        gnum = rand.nextInt(100)+1;
        
    }

    public int userInput(){
        System.out.print("Enter your choice : ");
        usernum = sc.nextInt();
        return usernum;
    }
    public void isCorrectNumber(){
        int a = userInput();
        if(gnum==a){
            System.out.println("Congratulations! You guessed it!");
                score++;
            } else if (usernum < gnum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
        }

    }
    public void check(){
        score=0;
        do{
            isCorrectNumber();
            attempts++;
        }while(score != 1);
    }

    public void score(){
        check();
        System.out.println();
        System.out.println("You guess the correct number in "+attempts+"attempts");
        int total;
        total = 100 - (attempts*3);
        if(total>0){
            System.out.println("Your final score is "+total + "%");
        }
        else{
            System.out.println("Your score is 0%");
        }
    }
}
