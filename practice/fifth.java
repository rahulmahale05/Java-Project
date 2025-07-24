package practice;

public class fifth {
    Node head;
    private int size;
    fifth(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
     public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head= head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head ;
        Node laasNode = head.next;
        while (laasNode.next != null) {
            laasNode=laasNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void printList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        fifth list = new fifth();
        list.addFirst("Rajesh");
        list.addFirst("Rahul");
        list.addLast("Mahale");
        // list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

    }
}
