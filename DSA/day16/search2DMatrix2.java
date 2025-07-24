package DSA.day16;

public class search2DMatrix2 {
    public static void main(String[] args) {    //Time Complexity = O(m+n)
        int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int key = 5;
        System.out.println(searchElement(matrix, key));
    }
    public static boolean searchElement(int matrix[][] , int key){
        int n = matrix.length;  int m = matrix[0].length;
        int s = 0;
        int e = m-1;
        while (s<m && e>=0) {
            System.out.println(1);
            if(matrix[s][e] == key) return true;
            if(matrix[s][e]<key) s++;
            else e--;
        }
        return false;
    }
}
