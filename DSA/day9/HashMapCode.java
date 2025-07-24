package DSA.day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;
            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }
        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key) return i;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            N=N*2;
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key , V value){
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di == -1){
                return null;
            }else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di == -1){
                return false;
            }else{
                return true;
            }
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key , bi);

            if(di == -1){
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public boolean isEmpty(){
            return n==0;
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }
            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println(map.isEmpty());
        map.put("India", 190);
        map.put("US", 150);
        map.put("US1", 150);
        map.put("US2", 150);
        map.put("US3", 150);
        map.put("US4", 150);
        map.put("US5", 150);
        map.put("US6", 150);
        map.put("US7", 150);
        map.put("US8", 150);
        map.put("US9", 150);
        map.put("US10", 150);
        map.put("US11", 150);
        map.put("US13", 150);
        map.put("US14", 150);
        map.put("US15", 150);
        map.put("US16", 150);
        System.out.println(map.get("India"));
        System.out.println(map.remove("US"));
        System.out.println(map.keySet());
    }
}
