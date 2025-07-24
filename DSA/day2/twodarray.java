package DSA.day2;

import java.util.Scanner;

public interface twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        boolean c = false;
        System.out.print("Enter which element do you want to search : ");
        int b = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j]==b){
                    c=true;
                    break;
                }
            }
        }
        if(c==true){
            System.out.println("The given element is found");
        }
        else{
            System.out.println("The given element is not found");
        }
    }
}
