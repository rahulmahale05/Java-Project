package DSA.day18;

public class KnightTour {
    public static boolean isOk(int board[][], int n, int r, int c, int p) {
        // Boundary or mismatch check
        if (r < 0 || c < 0 || r >= n || c >= n || board[r][c] != p) return false;

        // If all positions are visited correctly
        if (p == n * n - 1) return true;

        // Try all 8 possible knight moves
        boolean ans1 = isOk(board, n, r + 2, c + 1, p + 1);
        boolean ans2 = isOk(board, n, r + 2, c - 1, p + 1);
        boolean ans3 = isOk(board, n, r - 2, c + 1, p + 1);
        boolean ans4 = isOk(board, n, r - 2, c - 1, p + 1);
        boolean ans5 = isOk(board, n, r + 1, c + 2, p + 1);
        boolean ans6 = isOk(board, n, r + 1, c - 2, p + 1);
        boolean ans7 = isOk(board, n, r - 1, c + 2, p + 1);
        boolean ans8 = isOk(board, n, r - 1, c - 2, p + 1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] grid = {
            {0, 11, 16,  5, 20},
            {17, 4, 19, 10, 15},
            {12, 1,  8, 21,  6},
            {3, 18, 23, 14,  9},
            {24,13,  2,  7, 22}
        };

        System.out.println(isOk(grid, n, 0, 0, 0)); // Expected output: true
    }
}
