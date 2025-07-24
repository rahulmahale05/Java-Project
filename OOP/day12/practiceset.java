package day12;
import day1.Average;
class calculator{
    int a = 87 ;
    int b = 48;
    public void  add(){
        System.out.println("The addition is "+(a+b));
    }
    public void  sub(){
        System.out.println("The substaction is "+(a-b));
    }
    public void  mul(){
        System.out.println("The multiplication is "+(a*b));
    }
    public void  div(){
        System.out.println("The division is "+(a/b));
    }

}

class ScCalculator extends calculator{
    public void cal(){
        System.out.println("This is sc calculator");
        System.out.println(Math.sin(a+b));
    }
}

class Hybridcalculator extends ScCalculator{
    public void hybrid (){
        System.out.println("This is hybrid calculator");
    }
}
public class practiceset {
    public static void main(String[] args) {
        Hybridcalculator a = new Hybridcalculator();
        a.add();
        a.sub();
        a.mul();
        a.div();
        a.cal();
        a.hybrid();

        Average b = new Average();
        b.avg();
    }
    
}
