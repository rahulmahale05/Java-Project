package day18;

class complex{
    private int real , img ;
    public complex(int a , int b){
        this.real=a;
        this.img=b;
    }
    public complex (complex o){
        real=o.real;
        img=o.img;
        System.out.println(real);
        System.out.println(img);
    }
    void ram(){
        System.out.println(real);
        System.out.println(img);
    }
}

public class copyconstructor {
    public static void main(String[] args) {
    complex obj1 = new complex(12, 14);
    complex obj2 = new complex(obj1);  //invoking copy constructor
    complex obj3 = obj2;
    System.out.println(obj3 instanceof complex);
    obj3.ram();
    }
}
