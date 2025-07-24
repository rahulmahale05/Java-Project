package DSA.day6;

public class stackclass {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static class stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()) return -1;
            int top = head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()) return -1;
            return head.data;
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
