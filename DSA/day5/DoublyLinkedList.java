package DSA.day5;

public class DoublyLinkedList {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void printlist(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" <=> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void printReverse(){
        if(tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data+" <=> ");
            curr = curr.prev;
        }
        System.out.println("NULL");
    }
    public int deleteFirst(){
        if(head == null){
            System.out.println("Linked List is empty");
            return -1;
        }
        int d = head.data;
        head = head.next;
        head.prev = null;
        return d;
    }
    public int deleteLast(){
        if(tail == null){
            System.out.println("Linked List is empty");
            return -1;
        }
        int d = tail.data;
        tail = tail.prev;
        tail.next = null;
        return d;
    }

    public Node flatten(Node head) {
        if(head == null) return head;
        Node curr = head;
        while(curr != null){
            if(curr.child != null){
                Node next = curr.next;
                curr.next = flatten(curr.child);
                curr.next.prev = curr;
                curr.child = null;

                while(curr.next != null){
                    curr = curr.next;
                }

                if(next != null){
                    curr.next = next;
                    next.prev = curr;
                }
            }
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(1);
        ll.addLast(0);
        ll.deleteFirst();
        ll.deleteLast();
        ll.printlist();
        ll.printReverse();
    }
}
