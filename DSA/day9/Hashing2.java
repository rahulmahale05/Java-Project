package DSA.day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        
        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("Russia", 50);

        //print all elements of map
        System.out.println(map);

        //Search
        if(map.containsKey("India")){
            System.out.println("Yes");
        }
        if(map.containsValue(120)){
            System.out.println("Yes");
        }

        //store key to set
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" = "+map.get(key));
        }

        //get value from key
        System.out.println(map.get("India"));

        //Iteration in HashMap
        
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Delete from map
        map.remove("US");
        System.out.println(map);
        
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // for (Integer integer : list) {
        //     System.out.println(integer);
        // }
    }
}
