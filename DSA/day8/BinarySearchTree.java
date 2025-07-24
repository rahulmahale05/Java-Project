package DSA.day8;

import java.util.ArrayList;

public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root , int val){
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root , int key){
        if(root == null) return false;
        if(root.data == key) return true;
        else if(root.data > key) return search(root.left, key);
        else return search(root.right, key);
    }
    public static Node delete(Node root , int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }else if(root.data < val) {
            root.right = delete(root.right, val);
        }else{ //root.data == val
            //case 1;
            if(root.left == null && root.right == null) return null;
            
            //case 2
            else if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            //case 3
            Node Is = inorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        } return root;
    }
    public static void printInRange(Node root , int x , int y){
        if(root == null) return ;
        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }else if(root.data < x){
            printInRange(root.right, x, y);
        }else{
            printInRange(root.left, x, y);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        int i;
        for (i = 0; i < path.size()-1; i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.print(path.get(i)+"\n");
    }
    public static void printRoot2Leaf(Node root , ArrayList<Integer> path){
        if(root == null) return ;
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,4,6,10,11,14};
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        inorder(root);
        System.out.println();
        root = delete(root, 4);
        inorder(root);
        System.out.println();
        printInRange(root, 4, 8);
        System.out.println();
        if(search(root, 4)){
            System.out.println("Found");
        }else System.out.println("Not Found");
        ArrayList<Integer> path = new ArrayList<>();
        printRoot2Leaf(root, path);
    }
}
