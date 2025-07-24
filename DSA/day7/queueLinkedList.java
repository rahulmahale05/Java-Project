package DSA.day7;

public class queueLinkedList {
    static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                tail = head = newNode;
            } 
            tail.next=newNode;
            tail=newNode;
        }
 
 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single node
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }
 
 
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
           
            return head.data;
        }
 
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
        q.remove(); 
    }
}
