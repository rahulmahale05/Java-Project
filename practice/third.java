package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day7.str;

public class third {

    // public static void divide(int arr[] , int si , int ei){
    //     if(si>=ei){
    //         return;
    //     }
    //     int mid = si + (ei-si)/2;    //(si+ei)/2
    //     divide(arr, si, mid);
    //     divide(arr, mid+1, ei);
    //     concure(arr,si , mid , ei);
    // }
    // public static void concure(int arr[] , int si , int mid , int ei){
    //     int merged [] = new int [ei-si+1];
    //     int ind1 = si;
    //     int ind2 = mid+1;
    //     int x = 0 ; 
    //     while (ind1 <=mid && ind2 <= ei) {
    //         if(arr[ind1]<=arr[ind2]){
    //             merged[x++] = arr[ind1++];
    //         }else{
    //             merged[x++] = arr[ind2++];
    //         }
            
    //     }
    //     while(ind1 <= mid){
    //         merged[x++] = arr[ind1++];
    //     }
    //     while(ind2 <= ei){
    //         merged[x++] = arr[ind2++];
    //     }
    //     for (int i = 0 ,  j=si; i < merged.length; i++,j++) {
    //         arr[j]= merged[i] ;
    //     }
    // }


    // public static void main(String[] args) {
        // int arr [] = {6,5,3,7,9,3,5,7,2,8};
        // int n = arr.length - 1 ;
        // divide(arr, 0, n);
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

    // }

    // public static void main(String[] args) {
    //     int arr[] = {23,556,2,4,64,255,7,8,643,56};
    //     int n = arr.length;

    //     quickSort(arr, 0, n-1);

    //     for (int i : arr) {
    //         System.out.print(i+" ");
    //     }
    // }



    // public static void quickSort(int arr[] , int low , int high){
    //     if(low<high){
    //         int pi = partition(arr, low, high);

    //         quickSort(arr, low, pi-1);
    //         quickSort(arr, pi+1, high);
    //     }
    // }
    // public static int partition(int arr[] , int low , int high){
    //     int pivot = arr[high];
    //     int i = low - 1 ;
    //     for (int j = low; j < high; j++) {
    //         if(arr[j]<pivot){
    //             i++;

    //             int temp = arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    //     i++;
    //     int temp=arr[i];
    //     arr[i]=pivot;
    //     arr[high]=temp;
    //     return i ;
    // }

//   public static void main(String[] args) {
//     int arr [] = {12,3,4,56,36,78,2};

//     for (int i = 0; i < arr.length; i++) {
//         int current = arr[i];
//         int j = i-1;
//         while(j>=0 && arr[j]>current){
//             arr[j+1]=arr[j];
//             j--;
//         }
//         arr[j+1]=current;
//     }
//     for (int i : arr) {
//         System.out.println(i);
//     }
//   }

    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char [][] board = new char[n][n];

        helper(board, allBoard, 0);
        
        return allBoard;
        
    }
    public static void helper(char [][] board , List<List<String>> allBoard , int col){
        if(col==board.length){
            saveBoard(board, allBoard);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoard, col+1);
                board[row][col] = '_';
            }
        }
    }
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();
       
        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
       
        allBoards.add(newBoard);
    }
    public static boolean isSafe(int row , int col , char [][] board){
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]=='Q'){
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if(board[j][col]=='Q'){
                return false;
            }
        }
        int r = row;
        for (int c = col; c < board.length && r<board.length; c++ , r++) {
            if(board[r][c]=='Q'){
                return false;
            }
        }
        r = row;
        for (int c = col; c >=0 && r<board.length; c-- , r++) {
            if(board[r][c]=='Q'){
                return false;
            }
        }
        r = row;
        for (int c = col; c < board.length && r>=0; c++ , r--) {
            if(board[r][c]=='Q'){
                return false;
            }
        }
        r = row;
        for (int c = col; c >=0 && r>=0; c-- , r--) {
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many row you want on your chess board : ");
        int n = sc.nextInt();
        System.out.println(solveNQueens(n));
    }
}
