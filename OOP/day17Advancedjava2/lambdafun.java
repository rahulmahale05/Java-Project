package day17Advancedjava2;

@FunctionalInterface
interface ram{
    void meth();
}
// class Rahul implements ram{

//     @Override
//     public void meth() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'meth'");
//     }
    
// }
public class lambdafun {
    public static void main(String[] args) {
    //anonymous class
    // ram a = new ram() {
    //     @Override
    //     public void meth(){
    //         System.out.println("This is method 1");
    //     }
        
    // };
    // a.meth();

    ram a = ()->{
        System.out.println("I am rahul mahale");
    };
    a.meth();
    }
    
}
