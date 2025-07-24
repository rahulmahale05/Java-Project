package DSA.day6;

import java.util.ArrayList;

public class stackarraylist {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()) return -1;
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        System.out.println(st.peek());
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}