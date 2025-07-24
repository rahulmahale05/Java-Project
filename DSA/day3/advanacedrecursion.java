package DSA.day3;

import java.util.ArrayList;

public class advanacedrecursion {

    //Q1. Print all the permutations of a string.

    public static void permutations(String str  , String per){
        if (0 == str.length()){
            System.out.println(per);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            permutations(newString, per+currChar);
            
        }


    }
    //Time complexity - O(n*n!)


    //Q2. CountPathMaze 
 
    public static int countPaths(int i, int j, int m, int n) {
        if(i == m-1 || j == n-1) {
            return 1;
        }
 
 
        return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
    }
    //Time complexity - O(2^(m+n))

    //Q3. Tiling problem

    public static int placeTiles(int n, int m) {
        if(n < m) {
            return 1;
        } else if(n == m) {
            return 2;
        }
 
 
        return placeTiles(n-1, m) + placeTiles(n-m, m);
    }


    //Q4. Friends pairing problem

    public static int pairFriends(int n) {
        if(n <= 1) {
            return 1;
        }
  
  
         return pairFriends(n-1) + (n-1) * pairFriends(n-2);
     }

     
    // Q5. Subsets of a set

     public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i)+" ");
       }
       System.out.println();
   }


   public static void findSubsets(int n, ArrayList<Integer> subset) {
       if(n == 0) {
           printSubsets(subset);
           return;
       }


       findSubsets(n-1, subset);
       subset.add(n);
       findSubsets(n-1, subset);
       subset.remove(subset.size() - 1);
   }

 


    public static void main(String[] args) {
    //     String str = "abc";
    //    printPermutation(str, "");

    //    int m = 4, n = 5;
    //    System.out.println(countPaths(0, 0, m, n));

    //    int n = 4, m = 4;
    //    System.out.println(placeTiles(n, m));

       int n = 4;
       System.out.println(pairFriends(n));

    //    int n = 3;
    //    findSubsets(n, new ArrayList<Integer> ());
    }
    
}
