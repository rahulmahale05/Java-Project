package day7;

public class arrmethod {
    
    public static void main(String[] args) {
        


        //in arrays reference is passed in function hence 
        //original value in main function is also change


        int [] arr = {23,45,6,7,867,54,3,32,466};
        game(arr);
        System.out.println(arr[0]);



    }

    static void game(int [] arr){
        arr[0]=98;
    }
    
}
