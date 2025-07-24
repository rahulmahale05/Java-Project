package DSA.day4;

import java.util.ArrayList;

public class RatInMaze {
    public static void findWay(int mat[][] , int r , int c , ArrayList<String> ans , String path){
        int n = mat.length;
        if(r<0 || c<0 || r>=n || c>=n || mat[r][c] == 0 || mat[r][c] == -1) return;

        if(r==n-1 && c==n-1){
            ans.add(path);
            return;
        }
        mat[r][c] = -1;
        findWay(mat, r+1, c, ans, path+"D");  // D
        findWay(mat, r-1, c, ans, path+"U");  // U
        findWay(mat, r, c+1, ans, path+"R");  // R
        findWay(mat, r, c-1, ans, path+"L");  // L
        mat[r][c] = 1;
    }
    public static void main(String[] args) {
        int mat[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };
        ArrayList<String> ans = new ArrayList<>();
        findWay(mat, 0, 0, ans, "");
        System.out.println(ans);
    }
}
