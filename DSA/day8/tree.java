package DSA.day8;

import java.util.LinkedList;
import java.util.Queue;

import DSA.day8.tree.BinaryTree;
import DSA.day8.tree.TreeInfo;

public class tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }
        }
    }
    public static int countNodes(Node root){
        if(root == null) return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    public static int nodesSum(Node root){
        if(root == null) return 0;
        return nodesSum(root.left)+nodesSum(root.right)+root.data;
    }
    public static int treeHeight(Node root){
        if(root == null) return 0;
        return Math.max(treeHeight(root.left), treeHeight(root.right))+1;
    }
    public static int treeDiameter(Node root){
        if(root == null) return 0;
        int d = treeHeight(root.left)+treeHeight(root.right)+1;
        return Math.max(d, Math.max(treeDiameter(root.left), treeDiameter(root.right)));
    }
    static class TreeInfo{
        int h;
        int d;
        TreeInfo(int h,int d){
            this.h=h;
            this.d=d;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null) return new TreeInfo(0, 0);
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.h, right.h)+1;

        int d = left.h+right.h+1;
        int diameter = Math.max(d, Math.max(left.d, right.d));
        return new TreeInfo(myHeight, diameter);
    }
    public static Boolean isIdentical(Node root , Node subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }
    public static Boolean isSubtree(Node root , Node subRoot){
        if(subRoot == null) return true;
        if(root == null) return false;

        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)) return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void kLevelNodesSum(Node root,int k){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int n = 1;
        int sum=0;
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                n++;
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
            }
            if(k==n && currNode != null) sum += currNode.data;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println(countNodes(root));
        System.out.println(nodesSum(root));
        System.out.println(treeHeight(root));
        System.out.println(treeDiameter(root));
        System.out.println(diameter2(root).d);
        kLevelNodesSum(root, 3);
    } 
}
