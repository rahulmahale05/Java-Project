package DSA.day2;

import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder("tony");
    //  //Insert char
    //  sb.insert(0, 'S');
    //  System.out.println(sb);
    //  sb.delete(0, 1);
    //  System.out.println(sb);

    //  sb.append(" Stark");
    //  System.out.println(sb); 

    StringBuilder sb = new StringBuilder("HelloWorld");
    for (int i = 0; i < sb.length()/2; i++) {
        int front=i;
        int back = sb.length()-i-1;

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
    }
    
}
