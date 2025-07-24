package day17Advancedjava2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class filehandling {
    public static void main(String[] args) {
        
        //create file 

        // File myFile = new File("day17Advancedjava2/filehandling.txt");
        // try{
        //     myFile.createNewFile();
        // }
        // catch(IOException e){
        //     System.out.println("Unable to create this file");
        //     e.printStackTrace();
        // }

        //write in the file
        // try{
        //     FileWriter fwrite = new FileWriter("day17Advancedjava2/filehandling.txt");
        //     fwrite.write("This is our first file from this java couse\nokay now by");
        //     fwrite.close();
        // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }

        //reading from file
        // File myFile = new File("day17Advancedjava2/filehandling.txt");
        // try{
        //     Scanner sc = new Scanner(myFile);
        //     while(sc.hasNextLine()){
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }

        //delete file
        // File myFile = new File("day17Advancedjava2/filehandling.txt");
        // if(myFile.delete()){
        //     System.out.println("I have deleted "+myFile.getName());
        // }
        // else{
        //     System.out.println("Some error are occurs ");
        // }
        Random r = new Random();
        int a=r.nextInt(101,222);
        System.out.println(a);

    }
    
}
