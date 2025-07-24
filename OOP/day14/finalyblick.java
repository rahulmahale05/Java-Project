package day14;

import java.util.Scanner;

public class finalyblick {

    public static int greet(){
        try {
            int a = 56;
            int b = 0;
            int c = a/b;
            return c ;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
        System.out.println("End of the program");
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // try{
        //     int a = 5;
        //     int b = 0;
        //     int c = a/b;
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("this is the end of the program");
        // }
        // System.out.println("Rahul");

        // System.out.println(greet());

        // for (int i = 0 ; i < 10 ; i++){
        //     System.out.println(i);
            
        //     if(i==5){
        //         try{
        //         break;
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
        //     finally{
        //         System.out.println("End of the program");
        //     }
                
        //     }
        // }


        try{
            System.out.println(5/2);
        }
        finally{
            System.out.println("End of the program");
        }

    }
}
