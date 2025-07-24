// package practice1;

import java.util.ArrayList;
import java.util.List;

public class second {
    // public static boolean isSafe(int row, int col, char[][] board) {
    //     for(int j=0; j<board.length; j++) if(board[row][j] == 'Q') return false;
    //     for(int i=0; i<board.length; i++) if(board[i][col] == 'Q') return false;
    //    for(int c=col,r=row; c>=0 && r>=0; c--, r--) if(board[r][c] == 'Q') return false;
    //    for(int c=col,r=row; c<board.length && r>=0; r--, c++) if(board[r][c] == 'Q') return false;
    //    for(int c=col,r=row; c>=0 && r<board.length; r++, c--) if(board[r][c] == 'Q') return false;
    //    for(int c=col,r=row; c<board.length && r<board.length; c++, r++) if(board[r][c] == 'Q') return false;
    //     return true;
    // }
    // public static void saveBoard(char[][] board , List<List<String>> allBoards){
    //     String row="";
    //     List<String> newBoard = new ArrayList<>();
    //     for (int i = 0; i < board.length; i++) {
    //         row="";
    //         for (int j = 0; j < board.length; j++) {
    //             if(board[i][j]=='Q') row+='Q';
    //             else row+='.';
    //         }
    //         newBoard.add(row);
    //     }
    //     allBoards.add(newBoard);
    // }
    // public static void helper(char[][] board , List<List<String>> allBoards , int col){
    //     if(col==board.length){
    //         saveBoard(board,allBoards);
    //         return;
    //     }
    //     for (int row = 0; row < board.length; row++) {
    //         if(isSafe(row , col , board)){
    //             board[row][col]='Q';
    //             helper(board, allBoards, col+1);
    //             board[row][col]='.';
    //         }
    //     }
    // }
    // public static List<List<String>> solveNQueens(int n) {
    //     List<List<String>> allBoards = new ArrayList<>();
    //     char[][] board = new char[n][n];
       
    //     helper(board, allBoards, 0);
    //     return allBoards;
    // }





    static boolean sudokusolver(int [][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == 0) { // Empty cell
                    for (int num = 1; num <= board.length; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (sudokusolver (board)) return true; // Solved
                             else board[row][col] = 0;
                        }
                    }
                    return false; 
                }
            }
        }
        return true; 
    }
    static boolean isValid(int[][] board , int row , int col ,int num){
        for (int i = 0; i < board.length; i++) if(board[row][i]==num) return false;
        for (int i = 0; i < board.length; i++) if(board[i][col]==num) return false;
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) 
                if (board[i + startRow][j + startCol] == num) return false;
        return true;
    }
    static void printBoard(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // System.out.println(solveNQueens(4));


        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (sudokusolver(board)) {
            System.out.println("Sudoku solved successfully!");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
