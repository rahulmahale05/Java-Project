package DSA.day5;
import java.util.ArrayList;
import java.util.Collections;
class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
    //add elements
    a.add(12);
    a.add(14);
    a.add(17);
    System.out.println(a);

    //get elemnet 
    System.out.println(a.get(1));

    //add elements in between 
    a.add(1,15);

    //set element 
    a.set(1,25);

    //remove element
    a.remove(2);

    //size
    System.out.println(a.size());
    System.out.println(a);

    //loop
    for (int i = 0; i < a.size(); i++) {
        System.out.println(a.get(i));
    }

    //sorting
    Collections.sort(a);
    System.out.println(a);
    
    }
}
