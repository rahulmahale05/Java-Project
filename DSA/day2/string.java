package DSA.day2;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String a = "123";
        // int num = Integer.parseInt(a);
        // String b = Integer.toString(num);
        // System.out.println(num+5);
    
        // String str = sc.nextLine();
        // String result = "";
   
   
        // for(int i=0; i<str.length(); i++) {
        //   if(str.charAt(i) == 'e') {
        //     result += 'i';
        //   } else {
        //     result += str.charAt(i);
        //   }
        // }
   
   
        // System.out.println(result);
        

        String a = "Rahul Mahale";
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

        String c="Ra";
        String d="Rn";
        System.out.println(c.compareTo(d));

    }
    
}
