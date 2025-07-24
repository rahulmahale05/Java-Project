package day18;

import java.util.Scanner;

//longest common sequence
public class lcs {

    static int lcs1(String str1,String str2 , int i, int j){
        
        int ans = 0;
        if(i==str1.length() || j==str2.length()){
            return 0;
        }
        if(str1.charAt(i)==str2.charAt(j)){
            ans=1+lcs1(str1, str2 , i+1 , j+1);
        }
        else{
            ans=Math.max(lcs1(str1, str2, i+1, j), lcs1(str1, str2, i, j+1));
        }
        return ans;
        
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first string :");
    String str1=sc.next();
    System.out.println("Enter second string :");
    String str2=sc.next();
    System.out.println(lcs1(str1, str2, 0, 0));
    }
}
