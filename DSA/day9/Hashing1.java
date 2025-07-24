package DSA.day9;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Insert 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set not contains 6");
        }

        //Delete
        set.remove(3);

        //Print all elements of set
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
