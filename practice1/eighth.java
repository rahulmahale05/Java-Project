public class eighth {
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printlist(){
        if(head == null) return;
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public void last(int data){
        Node newnNode = new Node(data);
        if(head == null && tail == null){
            head = tail = newnNode;
            return;
        }
        tail.next = newnNode;
        tail = newnNode;
    }
    public int deleteFirst(){
        if(head == null) return -1;
        int a = head.data;
        head = head.next;
        return a;
    }
    public void inMi(int data , int pos){
        if(pos < 0) return;
        if(pos == 0){
            addFirst(data);
            return;
        }
        Node temp = head;   
        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next= temp.next;
        temp.next = newNode;
        
    }
    public static void main(String[] args) {
        eighth ll = new eighth();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.last(2);
        ll.last(3);
        System.out.println(ll.deleteFirst());
        ll.inMi(6, 2);
        ll.printlist();
        System.out.println(ll.tail.data);
    }
}