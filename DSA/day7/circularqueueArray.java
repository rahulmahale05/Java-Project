package DSA.day7;

public class circularqueueArray {
    static class queue{
        static int arr[];
        static int size; 
        static int rear=-1;
        static int front=-1;
        queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1) front=0;
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int ele = arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return ele;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(16);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(16);
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
