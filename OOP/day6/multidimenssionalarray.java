package day6;

import java.util.Scanner;

public class multidimenssionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] flats = new int [3][3];
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print("Enter flats no : ");
                flats[i][j] = sc.nextInt();

            }
        }

        for(int i=0;i<flats.length;i++){
            System.out.println();
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j] + " ");

            }
        }

    }
}
