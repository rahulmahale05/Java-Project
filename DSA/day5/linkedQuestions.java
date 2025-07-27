package DSA.day5;

public class linkedQuestions {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node removeNth(Node head , int n){
        if(head==null || head.next==null) return null;
        int size=0;
        Node curr = head;
        while(curr !=null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int pi = size-n;
        Node prev = head;
        int i=1;
        while(i<pi){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public Node findmiddle(Node head){
        Node hare = head;
        Node turtle = head;
        while(hare !=null && hare.next != null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }

    public Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node prev=null;
        Node curr=head;
        while(curr!= null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node recursiveReverse(Node head){
        if(head == null || head.next == null) return head;

        Node newNode = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public Boolean pallindrome(Node head){
        if(head == null || head.next==null) return true;
        Node middle = findmiddle(head);
        Node secondStart = reverse(middle.next);
        Node firstStart = head;
        while(secondStart!=null){
            if(firstStart.data != secondStart.data) return false;
            firstStart=firstStart.next;
            secondStart=secondStart.next;
        }
        return true;
    }

    public boolean hasCycle(Node head){
        if(head == null) return false;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast= fast.next.next;
            slow=slow.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public Node merge(Node h1 , Node h2){
        if(h1 == null && h2 == null) return null;
        Node newNode = new Node(0);
        Node curr = newNode;
        while (h1 != null && h2 != null) {
            if(h1.data < h2.data){
                curr.next = h1;
                h1 = h1.next;
            }else{
                curr.next = h2;
                h2 = h2.next;
            }
            curr = curr.next;
        }
        while (h1 != null) {
            curr.next = h1;
            h1 = h1.next;
        }
        while (h2 != null) {
                curr.next = h2;
                h2 = h2.next;
        }
        return newNode.next;
    }

    public Node mergeRec(Node h1 , Node h2){
        if(h1 == null && h2 == null) return null;
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        if(h1.data<h2.data){
            h1.next = mergeRec(h1.next, h2);
            return h1;
        }else{
            h2.next = mergeRec(h1, h2.next);
            return h2;
        }
    }

    public Node swap(Node head){
        if (head == null || head.next == null) return head;
        
        Node first = head;
        Node second = head.next;
        Node prev = null;
        while (first != null && second != null) {
            Node temp = second.next;

            second.next = first;
            first.next = temp;

            if(prev != null){
                prev.next = second;
            }else{
                head = second;
            }

            prev = first;
            first = temp;
            if(temp != null){
                second = temp.next;
            }else{
                second = null;
            }
        }
        return head;
    }


    public Node reverseKGroup(Node head, int k) {
        if (k <= 1 || head == null) return head;
        Node curr = head;
        int count = 0;
        while(count<k){
            if(curr == null) return head;
            count++;
            curr = curr.next;
        }
        Node prev = reverseKGroup(curr, k);

        curr = head;
        count = 0;
        while(count<k){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            count++;
        }
        return prev;
    }
    public static void main(String[] args) {
        linkedQuestions list = new linkedQuestions();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();
        list.head = list.removeNth(list.head, 3);
        list.printList();
        System.out.println(list.findmiddle(list.head).data);
        list.head = list.reverse(list.head);
        list.printList();
        list.head = list.recursiveReverse(list.head);
        list.printList();
        list.head = list.reverseKGroup(list.head, 3);
        list.printList();
        System.out.println(list.pallindrome(list.head));
        System.out.println(list.hasCycle(list.head));
        list.head = list.swap(list.head);
        list.printList();
        list.head = list.swap(list.head);
        list.printList();
    }
}























