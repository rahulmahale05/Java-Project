package day10;

import java.util.Scanner;


class library{
    Scanner sc = new Scanner(System.in);
    
    int no =0 ;
    String [] collection = new String[100];
    void addbook(){
            System.out.println("Enter which book you want to add : ");
            String book=sc.next();
            collection[no] = book ;
            no++;
      }
      void issuebook(){
        System.out.println("Enter which book you want to issue");
        String Bookwant = sc.next();
        for(int i=0; i<collection.length;i++){
            
            if(collection[i].equals(Bookwant)){
                System.out.println(Bookwant+" book is issued");
                collection[i]=Bookwant+" book is issued";
                return;
            }
        }
        System.out.println("the book not exist");

    }
      void showavailbooks(){
            int i=0;
            for(String item : collection){
                if(item == null)
                    break;
                else
                    System.out.println(item);

            }
      }
      void choice(){
        System.out.println("What do you want :\nIf you want to see availbook press 1 :\nIf you want issue book press 2:\nIf you want to add book press 3 :\nIf you want to do nothing then quit");
        int a=sc.nextInt();
            if(a==1){
                showavailbooks();
             }   
            else if(a==2){
               issuebook();
            }
            else if(a==3){
                addbook();
            }
            else{
               System.out.println("Invalid input");
            }
        System.out.print("if you want to perform operation again enter yes :");
        String d = sc.next();
        if(d.startsWith("yes"))
             choice();
        else
            System.out.println("************Thank you for visiting library ************");
    
    }
}
public class onlinelibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //implement a library using java class library
        //methods:addbook, issuebook, returnBook, show availbooks
        //properties:array to store the avail books,
        //Array to store the issued books
        library l = new library();
        l.choice();
    }
}

