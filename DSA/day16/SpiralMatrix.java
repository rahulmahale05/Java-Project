package DSA.day16;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printElement(matrix));
    }
    public static ArrayList<Integer> printElement(int matrix[][]){
        int srow = 0;   int scol = 0;
        int erow = matrix.length-1; int ecol = matrix[0].length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (srow<=erow && scol<=ecol) {
            //Top Element
            for (int i = scol; i <= ecol ; i++) {
                ans.add(matrix[srow][i]);
            }
            //Right Element
            for (int j = srow+1; j <= erow; j++) {
                ans.add(matrix[j][ecol]);
            }
            //Bottom Element
            for (int i= ecol-1; i>=scol; i--) {
                if(srow == erow) break;
                ans.add(matrix[erow][i]);
            }
            //Left Element
            for (int j = erow-1; j > srow; j--) {
                if(scol == ecol) break;
                ans.add(matrix[j][scol]);
            }
            srow++;     erow--;
            scol++;     ecol--;
        }
        return ans;
    }
}
