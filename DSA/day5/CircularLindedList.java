package DSA.day5;

public class CircularLindedList {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }
    public int deleteFirst(){
        if(head == null) return -1;
        if(head.next == head){
            int d = head.data;
            head = tail = null;
            return d;
        }
        int d = head.data;
        head = head.next;
        tail.next = head;
        return d;
    }
    public int deleteLast(){
        if(head == null) return -1;
        if(head.next == head){
            int d = head.data;
            head = tail =  null;
            return d;
        }
        int d = tail.data;
        Node curr = head;
        while (curr.next != tail) {
            curr = curr.next;
        }
        tail = curr;
        tail.next = head;
        return d;
    }
    public void printList(){
        if(head == null) {
            System.out.println("NULL");
            return;
        }
        System.out.print(head.data+"->");
        Node temp = head.next;
        while (temp != head) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        CircularLindedList c = new CircularLindedList();
        c.addFirst(2);
        c.addFirst(1);
        c.addLast(3);
        c.addLast(4);
        c.addFirst(0);
        c.addLast(5);
        c.printList();
        System.out.println(c.deleteFirst());
        System.out.println(c.deleteLast());
        c.printList();
    }
}
