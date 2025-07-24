// package practice1;

public class third {
    Node head;
    int size = 0;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next=newNode;
        newNode.next=null;
        size++;
    }

    public void printList(){
        if(head==null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head=null;
            return;
        }
        Node sLast = head;
        Node last = head.next;
        while (last.next != null) {
            sLast = last;
            last = last.next;
        }
        sLast.next = null;
    }
    public int size(){
        return size;
    }
    
    public static void main(String[] args) {
        third list = new third();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addLast("d");
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.size());
    }
}
