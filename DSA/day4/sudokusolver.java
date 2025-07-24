package DSA.day4;


// import day7.str;

// public class sudokusolver {
//     public static boolean isSafe(char [][] board , int row , int col , int number){
//         for (int i = 0; i < board.length; i++) {
//             if(board[i][col]==(char)(number - '0')){
//                 return false;
//             }
//             if(board[row][i]==(char)(number - '0')){
//                 return false;
//         }
//         }
//         int sr = (row/3)*3;
//         int sc = (col/3)*3;

//         for (int i = sr; i <sr+3 ; i++) {
//             for (int j = sc; j < sc+3; j++) {
//                 if(board[i][j]==(char)(number - '0')){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static boolean helper(char [][] board , int row , int col){
//         if(row == board.length){
//             return true;
//         }

//         int nrow = 0;
//         int ncol = 0;
//         if(col != board.length-1){
//             nrow = row;
//             ncol = col + 1;
//         }else{
//             nrow = row + 1;
//             ncol =  0;
//         }

//         if(board[row][col] != '.'){
//             if(helper(board, nrow, ncol)){
//                 return true;
//             }else{
//                 for (int i = 1; i < 10; i++) {
//                     if(isSafe(board , row , col , i)){
//                         board[row][col] = (char)(i+'0');
//                         if(helper(board, nrow, ncol)){
//                             return true;
//                         }else{
//                             board[row][col] = '.';
//                         }
//                     }
//                 }
//             }
//         }
//         return false;
//     }
//     public static void solveSudoku(char [][] board ){
//         helper(board, 0, 0);
//     }
//     public static void main(String[] args) {
        // char [][] board = {{'5','3','.','.','7','.','.','.','.'},
        // {'6','.','.','1','9','5','.','.','.'},
        // {'.','9','8','.','.','.','.','6','.'},
        // {'8','.','.','.','6','.','.','.','3'},
        // {'4','.','.','8','.','3','.','.','1'},
        // {'7','.','.','.','2','.','.','.','6'},
        // {'.','6','.','.','.','.','2','8','.'},
        // {'.','.','.','4','1','9','.','.','5'},
        // {'.','.','.','.','8','.','.','7','9'}};
        
//         solveSudoku(board);
//     }
// }

public class sudokusolver {
    
    // Solves the Sudoku board
    public boolean isSafe(int[][] board , int row , int col , int num){
      for (int i = 0; i < board.length; i++) {
         if(board[row][i] == num) return false;
         if(board[i][col] == num) return false;
      }
      int srow = row - row%3;
      int scol = col - col%3;
      for (int i = srow; i < srow+3; i++) {
         for (int j = scol; j < scol+3; j++) {
            if(i == row || j == col) continue;
            if(board[i][j] == num) return false;
         }
      }
      return true;
   }
   public boolean helper(int [][] board , int row , int col){
      if(row == 9) return true;
      int nrow = row;
      int ncol = col+1;
      if(ncol == 9){
         nrow = row+1;
         ncol = 0;
      }
      if(board[row][col] != 0){
         return helper(board, nrow, ncol);
      }else{
         for (int i = 0; i <= board.length; i++) {
            if(isSafe(board,row,col,i)){
               board[row][col] = i;
               if(helper(board, nrow, ncol))return true;
               else board[row][col] = 0;
            }
         }
      }
      return false;
   }
   public static void printBoard(int [][] board){
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j]+" ");
         }
         System.out.println();
      }
   }

    public static void main(String[] args) {
        sudokusolver solver = new sudokusolver();

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

        if (solver.helper(board, 0, 0)) {
            System.out.println("Sudoku solved successfully!");
            solver.printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    //Check valid or not

    // public static boolean allowed(char[][] board,char ch,int row,int col){
    //     //row 
    //     for(int i=0;i<9;i++){
    //         if(i==col)continue;
    //         if(board[row][i]==ch)return false;
    //     }

    //     //col
    //     for(int i=0;i<9;i++){
    //         if(i==row)continue;
    //         if(board[i][col]==ch)return false;
    //     }

    //     int minRow = (row/3)*3;
    //     int minCol = (col/3)*3;
    //     //submatrix
    //     for(int i=minRow; i<minRow+3;i++){
    //         for(int j=minCol;j<minCol+3;j++){
    //             if(i==row && j==col) continue;
    //             if(board[i][j]==ch)return false;
    //         }
    //     }return true;
    // }
    // public static boolean isValidSudoku(char[][] board) {
    //     for(int i=0;i<9;i++){
    //         for(int j=0;j<9;j++){
    //             if(board[i][j]=='.') continue;
    //             if(!allowed(board,board[i][j],i,j)) return false;
    //         }
    //     }return true;
    // }
}
