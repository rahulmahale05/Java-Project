import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(6);
        l1.add(4);
        l1.add(7);
        l1.add(6);
        l1.add(9);
        l1.addLast(56);
        l1.addFirst(56);
        // l1.removeFirst();

        // System.out.println(l1);
        // for(int i : l1){
        //     System.out.println(i);
        // }
        // System.out.println(l1.getFirst());
        // System.out.println(l1.getLast());
        // System.out.println(l1.getClass());
        System.out.println(l1);
        // System.out.println(l1.size());
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.getFirst());
            // l1.removeFirst();
        }
    }
    
}
