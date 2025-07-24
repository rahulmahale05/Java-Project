package DSA.day3;

import java.util.HashSet;
import java.util.Scanner;

public class recurquestion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int a = 1;
    // int step=towerOfHanoi(n, "S", "H", "D" , a);
    // System.out.println("The total step required is "+step);

    // String a="abcdefgh";
    // String revstring=reverseindex(a);
    // System.out.println(revstring);

    // String a="abcdefgh";
    // int n = a.length()-1;
    // reverseindex(a,n);

    // String a="abaadefagaah";
    // int n = 0;                    //timecomplexity O(n)
    // char element = 'a';
    // getindex(a, element, n);


    // int [] arr ={12,13,14,15,16,17,18};
    // boolean  a = issorted(arr, 0);
    // System.out.println(a);


    // endx("axbcdxxefxf", 0, 0, "");  //timecomplexity  O(n)


    // duplicate("rahulmahale", 0, "");   //Time complexity - O(n)

    // subsequences("abcd", 0, "");     // time complexity O(2^n)

    // HashSet<String> set = new HashSet<>();
    // subsequences("aaa", 0, "" , set); 


    keypadcombination("32", 0, "");
    }
    
    //Q1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
    // public static int towerOfHanoi(int n , String source ,String helper , String dest , int a){
    //     if(n==1){
    //         System.out.println("Transfer disk "+n+" from "+source+" to "+dest);
    //         return a;
    //     }
    //     a++;
    //     a=towerOfHanoi(n-1, source, dest, helper,a);
    //     System.out.println("Transfer disk "+n+" from "+source+" to "+dest);
    //     a++;
    //     a=towerOfHanoi(n-1, helper, source, dest,a);
    //     return a;
    // }

    //OR apna college code

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
        }


    //Q2. Print a string in reverse.

    // public static String reverseindex(String a){
    //     if(a.length()==1){
    //         return a;
    //     }
    //     char currchar=a.charAt(0);
    //     String nextstring=reverseindex(a.substring(1));
    //     return nextstring+currchar;
    // }

    //OR

    public static void reverseindex(String a,int ind){
        if(ind==0){
            System.out.print(a.charAt(ind));
            return;
        }
        System.out.print(a.charAt(ind));
        reverseindex(a, ind-1);
    }


    //Q3. Find the occurrence of the first and last occurrence of an element using recursion.

    public static int first = -1;
    public static int last = -1;

    public static void getindex(String str,char element , int ind){
        if(ind==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
    char currchar=str.charAt(ind) ;
    if(currchar == element){
        if(first == -1){
            first=ind;
        }
        else{
            last = ind;
        }
    }
    getindex(str, element, ind+1);
    }

    //Q4.Check if an array is sorted (strictly increasing). - O(n)

    public static boolean issorted(int arr[],int ind){
        if(ind==arr.length-1){
            return true;
        }
        if(arr[ind]<arr[ind+1]){
            return issorted(arr, ind+1);
        }
        else{
            return false;
        }

    }

    //Q5. Move all ‘x’ to the end of the string. - O(n)

    public static void endx(String str , int ind , int count,String str1){
        if(ind==str.length()){
            for(int i=0;i<count;i++){
                str1 += "x";
            }
            System.out.println(str1);
            return;
        }
        char currchar=str.charAt(ind);
        if(currchar=='x'){
            count++;
            endx(str, ind+1, count, str1);
        }
        else{
            str1 +=currchar;
            endx(str, ind+1, count, str1);
        }
    }

    //Q6. Remove duplicates in a string.

    public static boolean [] map=new boolean[26];
    public static void duplicate(String str , int ind ,String newString){
        if(ind==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(ind);
        if(map[currchar - 'a']){
            duplicate(str, ind+1,newString);
        }
        else{
            newString+=currchar;
            map[currchar-'a']=true;
            duplicate(str, ind+1, newString);
        }
    }


    //Q7. Print all subsequences of a string

    public static void subsequences(String str ,int ind , String newString ){
        if(ind == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(ind);
        //to be
        subsequences(str, ind+1, newString+currchar);
        //or not to be
        subsequences(str, ind+1, newString);
    }


    // Q8. Print all unique subsequences of a string.

    public static void subsequences(String str ,int ind , String newString , HashSet<String>set){
        if(ind == str.length()){
            if(set.contains(newString)){
                return;
            }
            System.out.println(newString);
            set.add(newString);
            return;
        }
        char currchar = str.charAt(ind);
        //to be
        subsequences(str, ind+1, newString+currchar , set);
        //or not to be
        subsequences(str, ind+1, newString , set);
    }

    // Q9. Print keypad combination
    // ( 0 -> .;
    // 1 -> abc
    // 2 -> def
    // 3 -> ghi
    // 4 -> jkl
    // 5 -> mno
    // 6 -> pqrs
    // 7 -> tu
    // 8 -> vwx
    // 9 -> yz
    // )

    public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypadcombination(String str , int ind , String combination){
        if(ind==str.length()){
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(ind);
        String mapping = keypad[currchar-'0'];

        for (int i = 0; i < mapping.length(); i++) {
            keypadcombination(str, ind+1, combination+mapping.charAt(i));
        }
    }
}
