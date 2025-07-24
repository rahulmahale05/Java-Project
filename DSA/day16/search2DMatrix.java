package DSA.day16;

public class search2DMatrix {
    public static void main(String[] args) {    //Time Complexity = O(log(m*n))
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int key = 34;
        System.out.println(searchElement(matrix, key));
    }
    public static boolean searchElement(int matrix[][] , int key){
        int m = matrix.length;  int n = matrix[0].length;
        int s = 0;
        int e = m-1;
        while (s<=e) {
            int midRow = s+(e-s)/2;
            if(key>=matrix[midRow][0] && key<=matrix[midRow][n-1]){
                return searchInRow(matrix, key , midRow);
            }else if(key<matrix[midRow][0]) e = midRow-1;
            else s = midRow+1;
        }
        return false;
    }
    public static boolean searchInRow(int matrix[][] , int key , int row){
        int n = matrix[0].length;
        int s = 0;
        int e = n-1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(matrix[row][mid] == key) return true;
            if(matrix[row][mid]>key) e = mid-1;
            else s = mid+1;
        }
        return false;
    }
}
