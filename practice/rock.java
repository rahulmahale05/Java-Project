package practice;

import java.util.*;

public class rock {

    public static void main(String[] args) {
        System.out.println("\n***************************Welcome to the Rock Paper Scissor  Game!***************************");
        playgame();
    }
    public static void playgame() {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("\nChoose your action between Rock / Paper / Scissor :");
        String man = sc.next();


        Random random = new Random();
        int num = random.nextInt(3)+1;
       
        String com;
        if(num == 1){
            com = "Rock" ;
        }
        else if(num == 2){
            com = "Paper" ;
        }
        else{
            com = "Scissor";
        }
        
        System.out.println("Computer choice is : "+ com );
        
        if ( man.equalsIgnoreCase("Rock") && com == "Paper" || man.equalsIgnoreCase("Paper") && com == "Scissor" || man.equalsIgnoreCase("Scissor") && com == "Rock"){
            System.out.println("Sorry,You Have Lose . Computer Have Won");
        }
        




        else  if ( man.equalsIgnoreCase(com) ){
            System.out.println("The match is Tie");
        }



    
        else


            System.out.println("Congratulatioon,You Have Won . Computer Have Lose");
        
        
        System.out.print("\nDo you want to play again? (y/n): ");
        String response = sc.next();

        if (response.equalsIgnoreCase("y")) {
            playgame();
        } else {
            System.out.println("\n***************************Thanks for playing!***************************");
        }
    }
}
    

