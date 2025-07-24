import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString()+" I am toString()";
    }
    @Override
    public String getMessage(){
        return super.getMessage()+" I am getMessage()";
    }
}


public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        for(int i=0;i<111;i++){
            int a = sc.nextInt();
            if(a<99){
                try{
                    // throw new MyException();
                    throw new ArithmeticException ("This is an exception");
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    e.printStackTrace();
                }
                // throw new ArithmeticException("Change the value");
                //if we do not want to stop program the throw use in try catch block
            }
        }
    }
}
