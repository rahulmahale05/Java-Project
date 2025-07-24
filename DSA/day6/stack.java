package DSA.day6;

import java.util.Stack;

public class stack {
    public static void pushBottom(int data , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data, s);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        reverseStack(s);
        pushBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        
        pushBottom(11, st);
        reverseStack(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
