package practice;

import java.util.Scanner;
public class sudokugame {
    // public static int size = 9;
    public boolean solveSudoku(int [][] board , int size){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] == 0){
                    System.out.println("You have 5 chance for guess correct number : ");
                    for (int j2 = 0; j2 < 5; j2++) {
                        System.out.print("Enter number at position ("+i+","+j+") : ");
                    int num = s.nextInt();
                    if(isSafe(board, i, j, num, size)){
                        System.out.println("The number is safe here");
                        board[i][j] = num;
                        return true;
                    }else{
                        System.out.println("The number is not safe here");
                    }
                    }
                    // for (int num = 1; num <= size; num++) {
                    //     if(isSafe(board,i,j, num , size)){
                    //         board[i][j] = num ;
                            // if(solveSudoku(board , size)){
                            //     return true;
                            // }else{
                            //     board[i][j] = 0;
                            // }
                    //     }
                    // }
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
        sudokugame solver = new sudokugame();
        int [][] board = {
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
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        int size = board.length;
        int i =0;
        while (i!=51) {
            if (solver.solveSudoku(board , size)) {
                solver.printBoard(board , size);
                i++;
                
            } 
        }
    }
}

