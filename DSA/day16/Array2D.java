package DSA.day16;

public class Array2D {
    static class pair {
        int i;
        int j;
        public pair(int i , int j){
            this.i = i;
            this.j = j;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int key = 6;
        printElement(matrix);
        pair ans = searchElement(matrix, key);
        System.out.println(ans.i+" "+ans.j);
        System.out.println(maxRowSum(matrix));
        System.out.println(maxColSum(matrix));
        System.out.println(diagonalSum(matrix,matrix.length));
    }
    public static void printElement(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int val : matrix[i]) {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static pair searchElement(int [][] matrix , int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == key){
                    return new pair(i, j);
                }
            }
        }
        return new pair(-1, -1);
    }
    public static int maxRowSum(int [][] matrix){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int val : matrix[i]) {
                sum+=val;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static int maxColSum(int [][] matrix){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum+=matrix[j][i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static int diagonalSum(int [][] matrix , int n){
        // int PD = 0;
        // int SD = 0;
        // int sum = PD+SD;
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         if(i == j){
        //             PD+=matrix[j][i];  //Optional direct add to sum
        //         }
        //         if(i == n-j-1){
        //             SD+=matrix[i][j];  //Optional direct add to sum
        //         }
        //     }
        // }



        //OR

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            if(i != n-i-1){
                sum+=matrix[i][n-i-1];
            }
        }
        if(n%2==1) sum+=matrix[n/2][n/2];
        return sum;
    }
}
