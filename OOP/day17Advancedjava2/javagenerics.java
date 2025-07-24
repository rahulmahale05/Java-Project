package day17Advancedjava2;

import java.util.ArrayList;

class mygeneric<T1>{
    int val=344;
    private T1 t1;
    public mygeneric(int val , T1 t1){
        this.val = val;
        this.t1 = t1;
    }
    public void a(){
        System.out.println(this.val);
        System.out.println(this.t1);
    }
}

public class javagenerics {
    public static void main(String[] args) {
        // ArrayList a = new ArrayList<>();
        // a.add("str0");
        // a.add(10);
        // a.add("str2");
        // int b = (int) a.get(1);
        // System.out.println(b);
        //using generics
        // ArrayList<Integer> a = new ArrayList<>();  //<integer> is generics
        // a.add(23);
        // int b=a.get(0);
        // System.out.println(b);
    mygeneric<Integer> a = new mygeneric(344, 24);
    a.a();
    }
}
