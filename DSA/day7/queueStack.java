package DSA.day7;

import java.util.Stack;

public class queueStack {
    static class queue{
        static Stack<Integer> s = new Stack<>();
        static Stack<Integer> s1 = new Stack<>();
        public static boolean isEmpty(){
            return s.isEmpty();
        }
        public static void add(int data){
            while(!s.isEmpty()) s1.push(s.pop());
            s.push(data);
            while(!s1.isEmpty()) s.push(s1.pop());
        }
        public static int remove(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s.pop();
        }
        public static int peek(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s.peek();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.remove();
        q.add(12);
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.remove();
    }
}
