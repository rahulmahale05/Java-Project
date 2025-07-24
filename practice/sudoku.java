package practice;

import java.util.Scanner;

public class sudoku {
    // public static int size = 9;
    public boolean solveSudoku(int [][] board , int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] == 0){
                    for (int num = 1; num <= size; num++) {
                        if(isSafe(board,i,j, num , size)){
                            board[i][j] = num ;
                            if(solveSudoku(board , size)){
                                return true;
                            }else{
                                board[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(int [][] board ,int row , int col , int num , int size){
       for (int i = 0; i < size; i++) {
        if(board[row][i]==num){
            return false;
        }
       }
       for (int i = 0; i < size; i++) {
        if(board[i][col]== num ){
            return false;
        }
       }
       int r = row - row%3;
       int c = col - col%3;
       for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if(board[i+r][j+c]==num){
                return false;
            }
        }
       }

       return true;
    }

    public void printBoard(int [][] board , int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sudoku solver = new sudoku();
        // int [][] board = {
        //     {5, 3, 0, 0, 7, 0, 0, 0, 0},
        //     {6, 0, 0, 1, 9, 5, 0, 0, 0},
        //     {0, 9, 8, 0, 0, 0, 0, 6, 0},
        //     {8, 0, 0, 0, 6, 0, 0, 0, 3},
        //     {4, 0, 0, 8, 0, 3, 0, 0, 1},
        //     {7, 0, 0, 0, 2, 0, 0, 0, 6},
        //     {0, 6, 0, 0, 0, 0, 2, 8, 0},
        //     {0, 0, 0, 4, 1, 9, 0, 0, 5},
        //     {0, 0, 0, 0, 8, 0, 0, 7, 9}
        // };
        System.out.println();
        String a = "*************** Sudoku Solver *****************";
        System.out.println(a.indent(50));
        System.out.println("Note:At black space enter zero(0) after that i will provide you solution");
        Boolean play = true;
        while(play){
            System.out.print("Enter size of sudoku : ");
            int size = sc.nextInt();
            int [][] board = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("Enter number in Your sudoku at correct place : ");
                    board[i][j] = sc.nextInt();
                }
            }
            if (solver.solveSudoku(board , size)) {
                System.out.println("Sudoku solved successfully!");
                solver.printBoard(board , size);
            } else {
                System.out.println("No solution exists.");
            }
            System.out.print("your Want to solve your sudoku again (yes/no) : ");
            String res = sc.next();
            if(res.equalsIgnoreCase("yes")){
                play=true;
            }
            else{
                play=false;
            }
            
        }
    }
}
