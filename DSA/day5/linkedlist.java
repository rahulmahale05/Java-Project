package DSA.day5;

import java.util.*;

public class linkedlist {
    Node head;
    private int size;
    linkedlist(){
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

    //add - first , last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
 
        if(head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    } 
     //print
     public void printList(){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
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
        Node secondLast =head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next= null;
    }

    // Add at particular index
    public void add(int pos , String data){
        if(pos < 0){
            System.out.println("Invalid Index");
            return;
        }
        if(pos==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
    //   linkedlist list = new linkedlist();  
    //   list.addFirst("a");
    //   list.addFirst("is");
    //   list.addLast("Danger");
    //   list.printList();
    // //   list.deleteFirst();
    // System.out.println(list.getSize());
    // list.deleteLast();
    //   list.printList();
    //   System.out.println(list.getSize());


    LinkedList<String> list = new LinkedList<>();

    list.add("Rahul");
    list.add("Rajesh");
    list.addLast("Mahale");
    System.out.println(list);
    list.addFirst("Name");
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.get(1));
    list.remove(2);
    list.removeFirst();
    list.removeLast();
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i)+"->");
    }
    System.out.println("Null");
    }
    
}
