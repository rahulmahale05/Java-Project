package DSA.day7;

import java.util.Stack;

public class queueStack2 {
    static class queue{
        static Stack<Integer> s = new Stack<>();
        static Stack<Integer> s1 = new Stack<>();
        public static boolean isEmpty(){
            return s.isEmpty();
        }
        public static void add(int data){
            s.push(data);
        }
        public static int remove(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while(!s.isEmpty()) s1.push(s.pop());
            int a = s1.pop();
            while(!s1.isEmpty()) s.push(s1.pop());
            return a;

        }
        public static int peek(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while(!s.isEmpty()) s1.push(s.pop());
            int a = s1.peek();
            while(!s1.isEmpty()) s.push(s1.pop());
            return a;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.remove();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.remove();
        System.out.println(q.peek());
        
    }
}
