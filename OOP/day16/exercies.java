package day16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class exercies {
    public static void main(String[] args) {
    // ArrayList<String> a = new ArrayList<>(10);
    // a.add("Rahul");
    // a.add("Rahul1");
    // a.add("Rahul2");
    // a.add("Rahul3");
    // a.add("Rahul4");
    // a.add("Rahul5");
    // a.add("Rahul6");
    // a.add("Rahul7");
    // a.add("Rahul8");
    // a.add("Rahul9");
    // a.add(0,"Rahul0");
    // a.remove(1);
    // boolean c=a.contains("Rahul");
    // System.out.println(c);
    // // a.clear();
    // a.indexOf("Rahul");
    // // a.removeAll(a);
    // a.set(2, null);
    
    // // a.ensureCapacity(4);
    // System.out.println(a.clone());
    // for(String i : a){
    //     System.out.println(i);
    // }
    // System.out.println(a.get(1));
    // System.out.println(a.indexOf("Rahul6"));
    // a.lastIndexOf("rahul"); //search from last
    // System.out.println(a.isEmpty());

    // LinkedList<String> a = new LinkedList<>();  //intial capacity not given
    // //all are same to array list 
    // //extra
    // a.addFirst(null);
    // a.addLast(null);
    // System.out.println(a);

    // ArrayDeque<Integer> a = new ArrayDeque<>();
    // a.addFirst(12);
    // System.out.println( a.getFirst());
    // a.removeFirst();

    // LocalTime b = LocalTime.now();
    // DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:MM:SS");
    // System.out.println(b.format(f));

    // Date d = new Date();
    // System.out.println(d.getHours() +":"+ d.getMinutes()+":"+ d.getSeconds());

    Calendar c = Calendar.getInstance();
    System.out.println(c.get(Calendar.HOUR_OF_DAY));

    // HashSet<Integer> a = new HashSet<>();
    // a.add(12);
    // a.add(1);
    // a.add(132);
    // a.add(14);
    // a.add(15);
    // a.add(12);
    // a.add(16);
    // a.add(127);
    // for(int i : a){
    //     System.out.println(i);
    // }
    
    
    
    }
    
}
