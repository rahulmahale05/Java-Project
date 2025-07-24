package DSA.day10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashing {
    public static void findMajority(int []nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() > nums.length/3) System.out.print(e.getKey()+" ");;
        }
    }
    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int e : arr1) {
            set.add(e);
        }
        for (int e : arr2) {
            set.add(e);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
    public static int intersection(int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>(); 
        int count=0;
        for (int e : arr1) {
            set.add(e);
        }
        for (int e : arr2) {
            if(set.contains(e)){
                System.out.print(e+" ");
                count++;
                set.remove(e);
            }
        }
        System.out.println();
        return count;
    }
    public static void itinerary(HashMap<String,String> map){
        String start="";
        for (String e : map.keySet()) {
            if(!map.containsValue(e)) start += e;
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.print(start+" -> ");
            start=map.get(start);
        }
        System.out.print(start);
    }
    public static void main(String[] args) {
        // int nums[] = {1,3,2,5,1,3,1,5,1};
        // findMajority(nums);
        // int arr1[] = {6,3,9,6,2,4};
        // int arr2[] = {7,3,9};
        // union(arr1, arr2);
        // System.out.println(intersection(arr1, arr2));
        // HashMap<String,String> map = new HashMap<>();
        // map.put("Chennai", "Bengaluru");
        // map.put("Mumbai", "Delhi");
        // map.put("Goa", "Chennai");
        // map.put("Delhi", "Goa");
        // itinerary(map);
        int arr[] = {10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}
