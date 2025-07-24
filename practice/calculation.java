package practice;

public class calculation {
    int Z;
    public void addition(int x,int y){
        Z=x+y;
        System.out.println("sum is "+Z);        
    }
    public void subtraction(int x, int y){
        Z=x-y;
        System.out.println("sub is "+Z);
    }
}
class myCalculation extends calculation {

    public void multiplication(int x, int y)
    {
        Z=x*y;
        System.out.println("multi is "+Z);
    }
    public static void main(String args[])
    {
        int a=20,b=10;
        myCalculation demo=new myCalculation();
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a,b);

   }
}
