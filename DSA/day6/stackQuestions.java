package DSA.day6;

import java.util.Stack;

public class stackQuestions {
    public static void main(String[] args) {
        System.out.println(isValid("({[]}[])"));
        int arr[] = {100,80,60,70,60,75,80};
        arr = stockSpan(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static boolean isValid(String s) {
        int n = s.length();
        if(n%2 != 0) return false;
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else {
                if(st.empty()) return false;
                switch(c){
                    case ')':
                        if(st.pop() != '(') return false;
                        break;
                    case '}':
                        if(st.pop() != '{') return false;
                        break;
                    case ']':
                        if(st.pop() != '[') return false;
                        break;
                }
            }
        }
        return st.empty();

    }
    public static int[] stockSpan(int arr[]){

        int ans[] = {0,0,0,0,0,0,0};
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while (st.size()>0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if(st.empty()) ans[i] = i+1;
            else ans[i] = i-st.peek();
            st.push(i);
        }
        return ans;
    }
}
