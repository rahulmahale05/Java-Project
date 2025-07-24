package day2;

public class increament {
    public static void main(String[] args) {
        //increament and decreament operator
        int a = 56 ;
        int b = a++;
        System.out.println(b);
        int c = a;
        System.out.println(c);

        int d = ++a;
        System.out.println(d);
        int e = a;
        System.out.println(e);

        System.out.println(a);
        System.out.println(a++); //first print a then a increament
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);


        int y = 7;
        int x = ++y + 8 ;
        System.out.println(x);

        char p = 'b';
        System.out.println(p++);
    }
}
