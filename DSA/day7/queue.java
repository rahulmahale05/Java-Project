package DSA.day7;

import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println(q.isEmpty());
        q.add(12);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}
