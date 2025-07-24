package day12;
class am{
    public int x =6;
    protected int y =65 ;
    int z = 5;
    private int w = 56;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}
public class accessmodifiers {
    public static void main(String[] args) {
        am a = new am();
        a.meth1();
    }
}
