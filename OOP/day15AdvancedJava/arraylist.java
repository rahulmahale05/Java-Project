import java.util.Scanner;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(6);
        l1.add(4);
        l1.add(7);
        l1.add(6);
        l1.add(9);
        System.out.println(l1);
        for(int i : l1){
            System.out.println(i);
        }
        l1.add(1,8);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        l1.set(1,18);   
        System.out.println(l1);

    }
}
